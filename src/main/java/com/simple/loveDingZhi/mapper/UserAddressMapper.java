package com.simple.loveDingZhi.mapper;

import com.simple.loveDingZhi.po.UserAddress;
import com.simple.loveDingZhi.po.UserAddressExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserAddressMapper {
    int countByExample(UserAddressExample example);

    int deleteByExample(UserAddressExample example);

    int deleteByPrimaryKey(Integer userAddressId);

    int insert(UserAddress record);

    int insertSelective(UserAddress record);

    List<UserAddress> selectByExample(UserAddressExample example);

    UserAddress selectByPrimaryKey(Integer userAddressId);

    int updateByExampleSelective(@Param("record") UserAddress record, @Param("example") UserAddressExample example);

    int updateByExample(@Param("record") UserAddress record, @Param("example") UserAddressExample example);

    int updateByPrimaryKeySelective(UserAddress record);

    int updateByPrimaryKey(UserAddress record);
    /**************************************************************************************************/
    //插入数据，会返回自增主键id，存在userAddress的userAddressId里
    int insertSelectiveReturnId(UserAddress userAddress);
    List<UserAddress> selectByUserId(Integer userId);
}