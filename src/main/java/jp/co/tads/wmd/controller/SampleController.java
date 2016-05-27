package jp.co.tads.wmd.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import jp.co.tads.wmd.persistence.MUser;

@EnableAutoConfiguration
@SpringBootApplication
@RestController
public class SampleController {

    @Autowired
    private JdbcTemplate jdbc;

    @RequestMapping(value = "sample", method = RequestMethod.GET)
    public String sample() {
        return "sample";
    }

    @RequestMapping(value = "db", method = RequestMethod.GET)
    public String db() {
        MUser user = new MUser();
        user.getName();
        user.getId();
        List<Map<String, Object>> lists = jdbc.queryForList("SELECT * FROM m_user");
        StringBuilder sb = new StringBuilder();
        for (Map<String, Object> list : lists) {
            for (Map.Entry<String, Object> e : list.entrySet()) {
                sb.append(e.getKey()).append(":").append(e.getValue()).append("　　");
            }
        }
        return sb.toString();
    }
}
