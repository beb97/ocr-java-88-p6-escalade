package com.ocr.P6.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class WelcomeController {

    private String user = "Pierre";

    @RequestMapping("/")
    public String welcome(Map<String, Object> model) {
        model.put("user", this.user);
        return "welcome";
    }
}
