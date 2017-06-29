package com.deploydemo.mapper;

import com.deploydemo.model.User;

import java.util.List;

/**
 * Created by zl on 2015/8/27.
 */
public interface UserMapper {
    public List<User> findUserInfo();
}
