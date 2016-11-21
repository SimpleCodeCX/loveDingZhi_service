package com.simple.loveDingZhi.service;

import com.simple.loveDingZhi.mapper.UserMapper;
import com.simple.loveDingZhi.po.User;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by simple on 2016/11/16.
 */
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;
    public User findUserById(int id)throws Exception{
        return userMapper.selectByPrimaryKey(id);
    };
}
