package com.simple.loveDingZhi.mapper;

import com.simple.loveDingZhi.po.DesignDrawing;
import com.simple.loveDingZhi.po.DesignDrawingExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DesignDrawingMapper {
    int countByExample(DesignDrawingExample example);

    int deleteByExample(DesignDrawingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DesignDrawing record);

    int insertSelective(DesignDrawing record);

    List<DesignDrawing> selectByExampleWithBLOBs(DesignDrawingExample example);

    List<DesignDrawing> selectByExample(DesignDrawingExample example);

    DesignDrawing selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DesignDrawing record, @Param("example") DesignDrawingExample example);

    int updateByExampleWithBLOBs(@Param("record") DesignDrawing record, @Param("example") DesignDrawingExample example);

    int updateByExample(@Param("record") DesignDrawing record, @Param("example") DesignDrawingExample example);

    int updateByPrimaryKeySelective(DesignDrawing record);

    int updateByPrimaryKeyWithBLOBs(DesignDrawing record);

    int updateByPrimaryKey(DesignDrawing record);
    /**************************************************************************************************/
    //插入数据，会返回自增主键id，存在designDrawing的id里
    int insertSelectiveReturnId(DesignDrawing designDrawing);
}