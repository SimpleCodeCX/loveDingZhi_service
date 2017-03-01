package com.simple.loveDingZhi.service;

import com.simple.loveDingZhi.po.BusinessCloth;

import java.util.List;

/**
 * Created by uidp5344 on 2017/3/1.
 */
public interface IBusinessClothService {
    public int insertSelective(BusinessCloth businessCloth);
    public List<BusinessCloth> selectListOnePage(int page);//page为第几页
    public List<BusinessCloth> selectListByUserName(String userName);//根据用户名获得用户自己的商城的衣服列表
}
