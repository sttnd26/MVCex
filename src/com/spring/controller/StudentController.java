package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class StudentController {

    @RequestMapping(value = "/submitForm.html", method = RequestMethod.POST)
    @ResponseBody
    String submitForm(StudentCO stud) {
        return "First name: " + stud.getFirstname() + "     Last name: " + stud.getLastname();
    }

//    @RequestMapping(value = "/submitForm.html", method = RequestMethod.POST)
//    @ResponseBody
//    String formData(@RequestParam("firstname") String fname,
//                    @RequestParam("lastname") String lname) {
//        return "First name: " + fname + "       Last name: " + lname;
//    }

//    @RequestMapping("/hello.html/{fname}/{lname}")
//    @ResponseBody
//    String returnNameMap(@PathVariable Map<String, String> requestMap) {
//        return requestMap.get("fname") + " " + requestMap.get("lname");
//    }

//    @RequestMapping("/hello.html/{fname}/{lname}")
//    @ResponseBody
//    String returnName(@PathVariable("fname") String firstName, @PathVariable("lname") String lastName) {
//        return firstName+" "+lastName;
//    }

//    @ResponseBody
//    @RequestMapping("/index")
//    ModelAndView index() {
//        ModelAndView modelAndView = new ModelAndView("index");
//        modelAndView.addObject("msg", "Hello World from jsp");
//        return modelAndView;
//    }
//    @ResponseBody
//    @RequestMapping("/hello.html")
//    String hello() {
//        return "Hello world";
//    }

}
