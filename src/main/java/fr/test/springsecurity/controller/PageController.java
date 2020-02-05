package fr.test.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/logout")
    public String logout() {
        return "logout";
    }

    @GetMapping("/admin")
    public ModelAndView admin() {
        ModelAndView model = new ModelAndView();
        model.setViewName("admin");
        return model;
    }

    @GetMapping("/")
    public String welcome() {
        return "welcome";
    }

    @GetMapping("/user")
    public ModelAndView user() {
        ModelAndView model = new ModelAndView();
        model.setViewName("user");
        return model;
    }
}
