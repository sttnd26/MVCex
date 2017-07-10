package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

    @ResponseBody
    @RequestMapping("/index")
    ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("msg", "Hello World from jsp");
        return modelAndView;
    }

    @ResponseBody
    @RequestMapping("/hello.html")
    String hello() {
        return "Hello world";
    }
}
