package com.simple.loveDingZhi.service;

import com.simple.loveDingZhi.po.User;

/**
 * Created by simple on 2016/11/16.
 */
public interface IUserService {
    public User findUserById(int id)throws Exception;
}
