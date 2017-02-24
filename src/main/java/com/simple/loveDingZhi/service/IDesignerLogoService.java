package com.simple.loveDingZhi.service;

import com.simple.loveDingZhi.po.DesignDrawing;
import com.simple.loveDingZhi.po.DesignerLogo;
import com.simple.loveDingZhi.po.DesignerLogoVo;

import java.util.List;

/**
 * Created by simple on 2017/2/5.
 */
public interface IDesignerLogoService {
    List<DesignerLogo> selectListByUserName(String userName);//根据用户名获得用户的logo列表
    List<DesignerLogo> selectListOnePage(int page);//page为第几页
    int insertSelective(DesignerLogo record);
    DesignerLogoVo selectDesignerLogoDetailsByDesignerLogoId(int designerLogoId);//根据设计师的logoId获得设计师的logo详细数据
}
