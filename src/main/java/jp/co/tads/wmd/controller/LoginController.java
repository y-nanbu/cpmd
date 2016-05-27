package jp.co.tads.wmd.controller;

import java.util.List;

import org.eclipse.collections.api.list.MutableList;
import org.eclipse.collections.impl.factory.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jp.co.tads.wmd.persistence.MUser;
import jp.co.tads.wmd.repository.MUserRepository;

@SpringBootApplication
@Controller
@ComponentScan
public class LoginController {

    @Autowired
    private MUserRepository user;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String init(Model model) {
        return "login/login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam(value = "userId", required = false) Long userId,
            @RequestParam(value = "pass", required = false) String password,
            Model model) {
        MUser loginUser = user.findUser(userId, password);
        MutableList<String> sampleList = Lists.mutable.with("Sample1", "Sample2", "Sample3", "Test1", "Test2", "Test3");
        List<String> sampleList2 = sampleList.select(s -> s.contains("S"));
        List<String> sampleList3 = sampleList.reject(s -> s.contains("S"));
        System.out.println(sampleList2);
        System.out.println(sampleList3);
        model.addAttribute("name", loginUser.getName());

        return "top/top";
    }
}
