package com.simple.loveDingZhi.service;

import com.simple.loveDingZhi.po.UserAddress;

/**
 * Created by uidp5344 on 2017/3/21.
 */
public interface IUserAddressService {
    public int insertSelective(UserAddress userAddress);
    public int insertSelectiveReturnId(UserAddress userAddress);
}
