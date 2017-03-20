package com.simple.loveDingZhi.service;

import com.simple.loveDingZhi.po.MyDiyCloth;
import com.simple.loveDingZhi.po.MyDiyClothVo;

/**
 * Created by uidp5344 on 2017/3/17.
 */
public interface IMyDiyClothService {
    public int insertSelectiveReturnId(MyDiyCloth myDiyCloth);
    public MyDiyClothVo selectDiyClothDetailsByMyDiyClothId(Integer myDiyClothId);
}
