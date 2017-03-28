package com.simple.loveDingZhi.po;

/**
 * Created by uidp5344 on 2017/3/20.
 */
public class MyDiyClothVo extends  MyDiyCloth {
    BusinessCloth businessCloth;
    User user;
    public BusinessCloth getBusinessCloth() {
        return businessCloth;
    }

    public void setBusinessCloth(BusinessCloth businessCloth) {
        this.businessCloth = businessCloth;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
