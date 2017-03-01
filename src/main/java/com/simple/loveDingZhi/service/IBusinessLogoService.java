package com.simple.loveDingZhi.service;

import com.simple.loveDingZhi.po.BusinessLogo;

import java.util.List;

/**
 * Created by uidp5344 on 2017/3/1.
 */
public interface IBusinessLogoService {
    int insertSelective(BusinessLogo businessLogo);
    public List<BusinessLogo> selectListOnePage(int page);//page为第几页
    public List<BusinessLogo> selectListByUserName(String userName);//根据用户名获得用户自己的商城的logo列表
}
