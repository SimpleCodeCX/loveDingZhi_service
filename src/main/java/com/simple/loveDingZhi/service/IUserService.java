package com.simple.loveDingZhi.service;

import com.simple.loveDingZhi.po.User;

/**
 * Created by simple on 2016/11/16.
 */
public interface IUserService {
    public User findUserById(int id_)throws Exception;
    public int insertSelective(User user_);
    public int countByPhoneNumber(String phoneNumber_);
    public int countByAccountNumber(String accountNumber_);
    public int countBySelective(User user);
    public User selectBySelective(User user);
    public int updateByAccountNumberSelective(User user);
}
