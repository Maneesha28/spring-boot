package com.example.demo2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class CourseController {

    /*@RequestMapping("/")
    public ModelAndView hello(ModelMap modelMap) {
        return new ModelAndView("course");
    }*/
    /*@GetMapping
    public String hello(HttpSession session, String name) {
        *//*HttpSession session = req.getSession();
        String name = req.getParameter("inputname");*//*
        session.setAttribute("username", name);
        return "course";
    }*/
    @GetMapping
    public ModelAndView hello(String name) {
        ModelAndView mv = new ModelAndView("course");
        mv.addObject("username", name);
        return mv;
    }

}
