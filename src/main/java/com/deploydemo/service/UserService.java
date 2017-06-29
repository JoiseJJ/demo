package com.deploydemo.service;

import com.deploydemo.mapper.UserMapper;
import com.deploydemo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zl on 2015/8/27.
 */

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getUserInfo(){
        List<User> users=userMapper.findUserInfo();
        //User user=null;
        return users;
    }

}
