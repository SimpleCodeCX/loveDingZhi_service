package com.simple.loveDingZhi.service;

import com.simple.loveDingZhi.mapper.BusinessLogoMapper;
import com.simple.loveDingZhi.po.BusinessLogo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by uidp5344 on 2017/3/1.
 */
public class BusinessLogoServiceImpl implements IBusinessLogoService {
    @Autowired
    BusinessLogoMapper businessLogoMapper;
    public int insertSelective(BusinessLogo businessLogo) {
        return businessLogoMapper.insertSelective(businessLogo);
    }
    public List<BusinessLogo> selectListOnePage(int page){
        //page代表第几页，每一页10个
        int pageFirst=(page-1)*10;//计算出该页的第一条数据序号
        return businessLogoMapper.selectListOnePage(pageFirst);
    }
    //根据用户名获得用户自己的商城的logo列表
    public List<BusinessLogo> selectListByUserName(String userName){
        return businessLogoMapper.selectListByUserName(userName);
    }
}
