package com.deploydemo.controller;

import com.deploydemo.model.User;
import com.deploydemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class HelloController {

    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        List<User> users = userService.getUserInfo();
        if(users!=null){
            model.addAttribute("name", users.get(users.size()-1).getLogin_name());
        }
        return "hello";
    }
    
}
