package com.simple.loveDingZhi.service;

import com.simple.loveDingZhi.mapper.BusinessClothMapper;
import com.simple.loveDingZhi.po.BusinessCloth;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by uidp5344 on 2017/3/1.
 */
public class BusinessClothServiceImpl implements IBusinessClothService {
    @Autowired
    BusinessClothMapper businessClothMapper;
    public int insertSelective(BusinessCloth businessCloth) {
        return businessClothMapper.insertSelective(businessCloth);
    }
}
