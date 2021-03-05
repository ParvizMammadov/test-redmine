package com.example.testredmine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class RedmineController {

    @GetMapping("/projects")
    public ModelAndView getProjects(Model model) {
        ModelAndView mv = new ModelAndView("projects.html");
        String message = "This is the projects page";
        mv.addObject("message", message);

        model.addAttribute("msg", message);

        return mv;
    }

}
