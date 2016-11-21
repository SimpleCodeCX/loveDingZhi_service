package com.simple.loveDingZhi.mapper;

import com.simple.loveDingZhi.po.DesignDrawing;
import com.simple.loveDingZhi.po.DesignDrawingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DesignDrawingMapper {
    int countByExample(DesignDrawingExample example);

    int deleteByExample(DesignDrawingExample example);

    int insert(DesignDrawing record);

    int insertSelective(DesignDrawing record);

    List<DesignDrawing> selectByExampleWithBLOBs(DesignDrawingExample example);

    List<DesignDrawing> selectByExample(DesignDrawingExample example);

    int updateByExampleSelective(@Param("record") DesignDrawing record, @Param("example") DesignDrawingExample example);

    int updateByExampleWithBLOBs(@Param("record") DesignDrawing record, @Param("example") DesignDrawingExample example);

    int updateByExample(@Param("record") DesignDrawing record, @Param("example") DesignDrawingExample example);
}