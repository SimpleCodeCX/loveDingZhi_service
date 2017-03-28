package com.simple.loveDingZhi.mapper;

import com.simple.loveDingZhi.po.ShopOrdersDetail;
import com.simple.loveDingZhi.po.ShopOrdersDetailExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopOrdersDetailMapper {
    int countByExample(ShopOrdersDetailExample example);

    int deleteByExample(ShopOrdersDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShopOrdersDetail record);

    int insertSelective(ShopOrdersDetail record);

    List<ShopOrdersDetail> selectByExample(ShopOrdersDetailExample example);

    ShopOrdersDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShopOrdersDetail record, @Param("example") ShopOrdersDetailExample example);

    int updateByExample(@Param("record") ShopOrdersDetail record, @Param("example") ShopOrdersDetailExample example);

    int updateByPrimaryKeySelective(ShopOrdersDetail record);

    int updateByPrimaryKey(ShopOrdersDetail record);

}