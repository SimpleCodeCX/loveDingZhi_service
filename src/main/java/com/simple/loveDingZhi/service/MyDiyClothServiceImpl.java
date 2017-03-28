package com.simple.loveDingZhi.service;

import com.simple.loveDingZhi.mapper.MyDiyClothMapper;
import com.simple.loveDingZhi.po.MyDiyCloth;
import com.simple.loveDingZhi.po.MyDiyClothVo;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by uidp5344 on 2017/3/17.
 */
public class MyDiyClothServiceImpl implements IMyDiyClothService {
    @Autowired
    private MyDiyClothMapper myDiyClothMapper;
    public int insertSelectiveReturnId(MyDiyCloth myDiyCloth) {
        return myDiyClothMapper.insertSelectiveReturnId(myDiyCloth);
    }
    public MyDiyClothVo selectDiyClothDetailsByMyDiyClothId(Integer myDiyClothId){
        return myDiyClothMapper.selectDiyClothDetailsByMyDiyClothId(myDiyClothId);
    }
}
