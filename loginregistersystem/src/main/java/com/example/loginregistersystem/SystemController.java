package com.example.loginregistersystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Objects;

@Controller
public class SystemController {

    @Autowired
    UserRepo repo;
    @Autowired
    UserService userService;

    @RequestMapping("/")
    public ModelAndView welcome(ModelMap modelMap) {
        return new ModelAndView("landingpage");
    }
    @GetMapping("/register")
    public ModelAndView register(ModelMap modelMap) {
        modelMap.put("user", new User());
        return new ModelAndView("register");
    }
    @PostMapping("/register")
    public ModelAndView register(@Validated @ModelAttribute("user") User user, BindingResult bindingResult) {
        if (foundDuplicateUsername(user.getUsername())) {
            bindingResult.rejectValue("username", "", "This username has already been taken!");
        }

        if (bindingResult.hasErrors()) {
            return new ModelAndView("register");
        }

        userService.save(user);
        return new ModelAndView("landingpage");
    }
    @GetMapping("/login")
    public ModelAndView login(ModelMap model, String error, String logout) {

        if (error != null) {
            model.put("error", "Your username and password is invalid.");
        }

        if (logout != null) {
            model.put("logout", "You have been logged out successfully.");
        }

        model.put("user", new User());

        return new ModelAndView("login");
    }

    private boolean foundDuplicateUsername(String username) {
        User duplicateUser = userService.findByUsername(username);
        return Objects.nonNull(duplicateUser);
    }
}
