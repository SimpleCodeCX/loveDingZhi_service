package com.simple.loveDingZhi.service;

import com.simple.loveDingZhi.mapper.DesignerLogoMapper;
import com.simple.loveDingZhi.po.DesignerLogo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by simple on 2017/2/5.
 */
public class DesignerLogoServiceImpl implements IDesignerLogoService{
    @Autowired
    private DesignerLogoMapper designerLogoMapper;
    public List<DesignerLogo> selectListByUserName(String userName) {
        return designerLogoMapper.selectListByUserName(userName);
    }

    public List<DesignerLogo> selectListOnePage(int page) {
        //page代表第几页，每一页10个
        int pageFirst=(page-1)*10;//计算出该页的第一条数据序号
        return designerLogoMapper.selectListOnePage(pageFirst);
    }

    public int insertSelective(DesignerLogo record){
        return designerLogoMapper.insertSelective(record);
    }
}
