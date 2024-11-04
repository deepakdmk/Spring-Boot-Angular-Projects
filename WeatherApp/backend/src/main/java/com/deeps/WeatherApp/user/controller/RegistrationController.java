package com.deeps.WeatherApp.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.deeps.WeatherApp.user.service.RegistrationService;
import com.deeps.WeatherApp.user.view.UserView;

@Controller
@RequestMapping("/signup")
public class RegistrationController {

    private RegistrationService regService;

    public RegistrationController(RegistrationService springRegService) {
        regService = springRegService;
    }

    @GetMapping
    public String showRegistrationForm() {
        return "signup";
    }

    @ModelAttribute("userView")
    public UserView userRegistrationView() {
        return new UserView();
    }

    @PostMapping
    public String registerUser(@ModelAttribute("userView") UserView userView) {
        System.out.println("here");
        // if (Object.class != null) {
        return "redirect:/signup?success";
        // } else {
        // return "redirect:/signup?exists";
        // }
    }
}
