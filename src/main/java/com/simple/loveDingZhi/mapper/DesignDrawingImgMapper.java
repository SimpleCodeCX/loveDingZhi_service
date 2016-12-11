package com.simple.loveDingZhi.mapper;

import com.simple.loveDingZhi.po.DesignDrawingImg;
import com.simple.loveDingZhi.po.DesignDrawingImgExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DesignDrawingImgMapper {
    int countByExample(DesignDrawingImgExample example);

    int deleteByExample(DesignDrawingImgExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DesignDrawingImg record);

    int insertSelective(DesignDrawingImg record);

    List<DesignDrawingImg> selectByExample(DesignDrawingImgExample example);

    DesignDrawingImg selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DesignDrawingImg record, @Param("example") DesignDrawingImgExample example);

    int updateByExample(@Param("record") DesignDrawingImg record, @Param("example") DesignDrawingImgExample example);

    int updateByPrimaryKeySelective(DesignDrawingImg record);

    int updateByPrimaryKey(DesignDrawingImg record);
}