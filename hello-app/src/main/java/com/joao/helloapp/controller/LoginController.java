package com.joao.helloapp.controller;

import com.joao.helloapp.entities.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String getLogin(Model model){
        model.addAttribute("userInfo", new UserInfo());
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@ModelAttribute UserInfo userInfo, Model model){
        model.addAttribute("userInfo", userInfo);
        return "login";
    }
}
