package com.deploydemo.controller;

import com.deploydemo.model.User;
import com.deploydemo.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by zl on 2015/8/27.
 */
@Controller
public class UserController {

    private Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/getUserInfo")
    @ResponseBody
    public User getUserInfo() {
        List<User> users = userService.getUserInfo();
        if(users!=null){
            System.out.println("user.getLogn_name():"+users.get(0).getLogin_name());
            logger.info("user.getDisplay_name():"+users.get(0).getDisplay_name());
        }
        return users.get(0);
    }
}
