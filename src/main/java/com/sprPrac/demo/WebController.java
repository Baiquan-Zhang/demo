package com.sprPrac.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {

    @GetMapping(value = "/")
    @ResponseBody
    public String index() {
        return "Hello World!";
    }
}
