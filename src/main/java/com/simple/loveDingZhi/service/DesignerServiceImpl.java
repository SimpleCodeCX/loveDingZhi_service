package com.simple.loveDingZhi.service;

import com.simple.loveDingZhi.mapper.DesignerMapper;
import com.simple.loveDingZhi.po.Designer;
import com.simple.loveDingZhi.po.DesignerCustom;
import com.simple.loveDingZhi.po.DesignerVo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by simple on 2016/12/11.
 */
public class DesignerServiceImpl implements IDesignerService {
    @Autowired
    DesignerMapper designerMapper;
    public int insertSelective(Designer designer) {
        return designerMapper.insertSelective(designer);
    }
    public  int updateCountByUserId(int userId){
        return designerMapper.updateCountByUserId(userId);
    }
    public List<DesignerCustom> selectDesignerList() {
        return designerMapper.selectDesignerList();
    }
    public DesignerVo selectDesignerDetailsByUserId(Integer userId){
        return designerMapper.selectDesignerDetailsByUserId(userId);
    }
}
