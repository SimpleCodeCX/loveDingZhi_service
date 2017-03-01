package com.simple.loveDingZhi.service;

import com.simple.loveDingZhi.mapper.BusinessClothMapper;
import com.simple.loveDingZhi.po.BusinessCloth;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by uidp5344 on 2017/3/1.
 */
public class BusinessClothServiceImpl implements IBusinessClothService {
    @Autowired
    BusinessClothMapper businessClothMapper;
    public int insertSelective(BusinessCloth businessCloth) {
        return businessClothMapper.insertSelective(businessCloth);
    }
    public List<BusinessCloth> selectListOnePage(int page){
        //page代表第几页，每一页10个
        int pageFirst=(page-1)*10;//计算出该页的第一条数据序号
        return businessClothMapper.selectListOnePage(pageFirst);
    }
    //根据用户名获得用户自己的商城的衣服列表
    public List<BusinessCloth> selectListByUserName(String userName){
           return businessClothMapper.selectListByUserName(userName);
    }
}
