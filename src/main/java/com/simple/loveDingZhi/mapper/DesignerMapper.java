package com.simple.loveDingZhi.mapper;

import com.simple.loveDingZhi.po.Designer;
import com.simple.loveDingZhi.po.DesignerCustom;
import com.simple.loveDingZhi.po.DesignerExample;
import com.simple.loveDingZhi.po.DesignerVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DesignerMapper {
    int countByExample(DesignerExample example);

    int deleteByExample(DesignerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Designer record);

    int insertSelective(Designer record);

    List<Designer> selectByExampleWithBLOBs(DesignerExample example);

    List<Designer> selectByExample(DesignerExample example);

    Designer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Designer record, @Param("example") DesignerExample example);

    int updateByExampleWithBLOBs(@Param("record") Designer record, @Param("example") DesignerExample example);

    int updateByExample(@Param("record") Designer record, @Param("example") DesignerExample example);

    int updateByPrimaryKeySelective(Designer record);

    int updateByPrimaryKeyWithBLOBs(Designer record);

    int updateByPrimaryKey(Designer record);
    /**************************************************************************************************/
    //通过userId使设计稿的作品数加1
    int updateCountByUserId(int userId);
    List<DesignerCustom> selectDesignerList();
    //通过userId获得设计师详情
    DesignerVo selectDesignerDetailsByUserId(Integer userId);
}