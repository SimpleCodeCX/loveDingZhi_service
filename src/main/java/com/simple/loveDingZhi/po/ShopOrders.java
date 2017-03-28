package com.simple.loveDingZhi.po;

import java.util.Date;

public class ShopOrders {
    private Integer id;

    private Integer myDiyClothId;

    private Integer price;

    private Date date;

    private Boolean isPay;

    private Integer userAddressId;

    private Integer count;

    private Integer totalprice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMyDiyClothId() {
        return myDiyClothId;
    }

    public void setMyDiyClothId(Integer myDiyClothId) {
        this.myDiyClothId = myDiyClothId;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Boolean getIsPay() {
        return isPay;
    }

    public void setIsPay(Boolean isPay) {
        this.isPay = isPay;
    }

    public Integer getUserAddressId() {
        return userAddressId;
    }

    public void setUserAddressId(Integer userAddressId) {
        this.userAddressId = userAddressId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Integer totalprice) {
        this.totalprice = totalprice;
    }
}