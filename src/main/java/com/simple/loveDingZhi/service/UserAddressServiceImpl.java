package com.simple.loveDingZhi.service;

import com.simple.loveDingZhi.mapper.UserAddressMapper;
import com.simple.loveDingZhi.po.UserAddress;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by uidp5344 on 2017/3/21.
 */
public class UserAddressServiceImpl implements IUserAddressService {
    @Autowired
    private UserAddressMapper userAddressMapper;

    public int insertSelective(UserAddress userAddress) {
        return userAddressMapper.insertSelective(userAddress);
    }

    public int insertSelectiveReturnId(UserAddress userAddress) {
        return userAddressMapper.insertSelectiveReturnId(userAddress);
    }

    public int updateByPrimaryKeySelective(UserAddress userAddress) {
        return userAddressMapper.updateByPrimaryKeySelective(userAddress);
    }
}
