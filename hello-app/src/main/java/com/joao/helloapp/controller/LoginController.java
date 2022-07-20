package com.joao.helloapp.controller;

import com.joao.helloapp.entities.UserInfo;
import com.joao.helloapp.model.Ip;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import javax.validation.Valid;


@Controller
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String getLogin(Model model){
        model.addAttribute("userInfo", new UserInfo());
        String url = "http://ip-api.com/json/";
        RestTemplate restTemplate = new RestTemplate();
        Ip result = restTemplate.getForObject(url, Ip.class);
        System.out.println(result);
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@Valid UserInfo userInfo, Model model, BindingResult bindingResult){
        model.addAttribute("userInfo", userInfo);
        if(bindingResult.hasErrors()){
            return "login";
        }
        return "login";
    }

}
