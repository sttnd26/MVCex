package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Controller
public class StudentController {

//    @RequestMapping(value = "/submitForm.html", method = RequestMethod.POST)
//    @ResponseBody
//    String formData(@RequestParam("firstname") String fname,
//                    @RequestParam("lastname") String lname) {
//        return "First name: " + fname + "       Last name: " + lname;
//    }
        @ModelAttribute
        void addingObject(Model model)
        {
            model.addAttribute("heading","Spring MVC Demo");
        }

//    @RequestMapping(value = "/submitForm.html", method = RequestMethod.POST)
//    @ResponseBody
//    String submitForm(StudentCO stud) {
//        return "First name: " + stud.getFirstname() + " Last name: " + stud.getLastname();
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

    @ResponseBody
    @RequestMapping("/index")
    ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("msg","Hello from index.jsp");
        return modelAndView;
    }

    @RequestMapping("/dummy")
     ModelAndView dummy() {
        ModelAndView modelAndView = new ModelAndView("dummy");
        return modelAndView;
    }
//    @ResponseBody
//    @RequestMapping("/hello.html")
//    String hello() {
//        return "Hello world";
//    }

}
