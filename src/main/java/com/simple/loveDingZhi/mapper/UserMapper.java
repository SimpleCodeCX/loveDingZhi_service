package com.simple.loveDingZhi.mapper;

import com.simple.loveDingZhi.po.User;
import com.simple.loveDingZhi.po.UserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
  /*  int countByExample(UserExample example);

    int deleteByExample(UserExample example);*/


    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

   /* List<User> selectByExample(UserExample example);*/

    User selectByPrimaryKey(Integer id);

   /* int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);*/

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    /**************************************************************************************************/
    int countByPhoneNumber(String phoneNumber);
    int countByAccountNumber(String accountNumber);
    int countBySelective(User user);
    User selectBySelective(User user);
    //通过账号更新用户数据
    int updateByAccountNumberSelective(User user);
}