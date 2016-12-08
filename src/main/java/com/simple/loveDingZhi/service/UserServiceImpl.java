package com.simple.loveDingZhi.service;

import com.simple.loveDingZhi.mapper.UserMapper;
import com.simple.loveDingZhi.po.User;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by simple on 2016/11/16.
 */
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;
    /**
     * Created by simple on 2016/11/16.
     * 根据id查询用户数据
     */
    public User findUserById(int id_)throws Exception{
        return userMapper.selectByPrimaryKey(id_);
    }
    /**
     * Created by simple on 2016/11/27.
     * 插入用户可选的数据
     */
    public int insertSelective(User user_){
        return  userMapper.insertSelective(user_);
    }
    /**
     * Created by simple on 2016/11/27.
     * 查询手机号码是否存在
     */
     public int countByPhoneNumber(String phoneNumber_){
         return  userMapper.countByPhoneNumber(phoneNumber_);
    }
    /**
     * Created by simple on 2016/12/03.
     * 查询账号是否存在
     */
    public int countByAccountNumber(String accountNumber_){
        return  userMapper.countByAccountNumber(accountNumber_);
    }
    /**
     * Created by simple on 2016/11/27.
     * 查询用户数据条数
     */
    public int countBySelective(User user_){
        return  userMapper.countBySelective(user_);
    }
    /**
     * Created by simple on 2016/12/03.
     * 根据User查询用户数据
     */
    public User selectBySelective(User user_){
        return userMapper.selectBySelective(user_);
    }
    /**
     * Created by simple on 2016/12/03.
     * 根据账号更新用户数据
     */
    public int updateByAccountNumberSelective(User user_){
        return userMapper.updateByAccountNumberSelective(user_);
    }


}
