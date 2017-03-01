package com.simple.loveDingZhi.service;

import com.simple.loveDingZhi.mapper.BusinessLogoMapper;
import com.simple.loveDingZhi.po.BusinessLogo;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by uidp5344 on 2017/3/1.
 */
public class BusinessLogoServiceImpl implements IBusinessLogoService {
    @Autowired
    BusinessLogoMapper businessLogoMapper;
    public int insertSelective(BusinessLogo businessLogo) {
        return businessLogoMapper.insertSelective(businessLogo);
    }
}
