package com.simple.loveDingZhi.mapper;

import com.simple.loveDingZhi.po.DesignDrawing;
import com.simple.loveDingZhi.po.DesignerLogo;
import com.simple.loveDingZhi.po.DesignerLogoExample;
import com.simple.loveDingZhi.po.DesignerLogoVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DesignerLogoMapper {
    int countByExample(DesignerLogoExample example);

    int deleteByExample(DesignerLogoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DesignerLogo record);

    int insertSelective(DesignerLogo record);

    List<DesignerLogo> selectByExampleWithBLOBs(DesignerLogoExample example);

    List<DesignerLogo> selectByExample(DesignerLogoExample example);

    DesignerLogo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DesignerLogo record, @Param("example") DesignerLogoExample example);

    int updateByExampleWithBLOBs(@Param("record") DesignerLogo record, @Param("example") DesignerLogoExample example);

    int updateByExample(@Param("record") DesignerLogo record, @Param("example") DesignerLogoExample example);

    int updateByPrimaryKeySelective(DesignerLogo record);

    int updateByPrimaryKeyWithBLOBs(DesignerLogo record);

    int updateByPrimaryKey(DesignerLogo record);

    /**************************************************************************************************/
    List<DesignerLogo> selectListOnePage(int pageFirst);//page为第几页
    List<DesignerLogo> selectListByUserName(String userName);//根据用户名获得用户的logo列表

    DesignerLogoVo selectDesignerLogoDetailsByDesignerLogoId(int designerLogoId);//根据设计师的logoId获得设计师的logo详细数据
}