package jp.co.tads.wmd.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestController {
    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String getTest() {
        return "test";
    }
}
