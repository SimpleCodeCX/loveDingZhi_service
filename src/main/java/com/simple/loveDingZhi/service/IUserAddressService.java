package com.simple.loveDingZhi.service;

import com.simple.loveDingZhi.po.UserAddress;

import java.util.List;

/**
 * Created by uidp5344 on 2017/3/21.
 */
public interface IUserAddressService {
    public UserAddress selectByPrimaryKey(Integer userAddressId);
    public int insertSelective(UserAddress userAddress);
    public int insertSelectiveReturnId(UserAddress userAddress);
    public List<UserAddress> selectByUserId(Integer userAddressId);
    public int updateByPrimaryKeySelective(UserAddress record);
}
