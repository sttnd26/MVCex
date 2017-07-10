package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.Map;

@Controller
//@RequestMapping("/dummy")
public class StudentController {

    @RequestMapping("/hello.html/{fname}/{lname}")
    @ResponseBody
    String returnName(@PathVariable("fname") String firstName, @PathVariable("lname") String lastName) {
        return firstName+" "+lastName;
    }

//    @ResponseBody
//    @RequestMapping("/index")
//    ModelAndView index() {
//        ModelAndView modelAndView = new ModelAndView("index");
//        modelAndView.addObject("msg", "Hello World from jsp");
//        return modelAndView;
//    }
    @ResponseBody
    @RequestMapping("/hello.html")
    String hello() {
        return "Hello world";
    }

}
