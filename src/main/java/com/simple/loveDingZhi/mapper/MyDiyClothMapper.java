package com.simple.loveDingZhi.mapper;

import com.simple.loveDingZhi.po.MyDiyCloth;
import com.simple.loveDingZhi.po.MyDiyClothExample;
import com.simple.loveDingZhi.po.MyDiyClothVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MyDiyClothMapper {
    int countByExample(MyDiyClothExample example);

    int deleteByExample(MyDiyClothExample example);

    int deleteByPrimaryKey(Integer myDiyClothId);

    int insert(MyDiyCloth record);

    int insertSelective(MyDiyCloth record);

    List<MyDiyCloth> selectByExample(MyDiyClothExample example);

    MyDiyCloth selectByPrimaryKey(Integer myDiyClothId);

    int updateByExampleSelective(@Param("record") MyDiyCloth record, @Param("example") MyDiyClothExample example);

    int updateByExample(@Param("record") MyDiyCloth record, @Param("example") MyDiyClothExample example);

    int updateByPrimaryKeySelective(MyDiyCloth record);

    int updateByPrimaryKey(MyDiyCloth record);

   /**************************************************************************************************/
   int insertSelectiveReturnId(MyDiyCloth myDiyCloth);
    MyDiyClothVo selectDiyClothDetailsByMyDiyClothId(Integer myDiyClothId);
}