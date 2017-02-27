package com.simple.loveDingZhi.service;

import com.simple.loveDingZhi.mapper.BusinessMapper;
import com.simple.loveDingZhi.po.Business;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by uidp5344 on 2017/2/27.
 */
public class BusinessServiceImpl implements IBusinessService {
    @Autowired
    BusinessMapper businessMapper;

    public int insertSelective(Business business) {
        return businessMapper.insertSelective(business);
    }
}
