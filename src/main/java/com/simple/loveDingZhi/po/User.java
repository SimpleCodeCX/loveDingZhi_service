package com.simple.loveDingZhi.po;

public class User {
    private Integer id;

    private String realName;

    private String userName;

    private String phoneNumber;

    private Boolean isDesigner;

    private Boolean isBusiness;

    private String touXiangUrl;

    private String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    public Boolean getIsDesigner() {
        return isDesigner;
    }

    public void setIsDesigner(Boolean isDesigner) {
        this.isDesigner = isDesigner;
    }

    public Boolean getIsBusiness() {
        return isBusiness;
    }

    public void setIsBusiness(Boolean isBusiness) {
        this.isBusiness = isBusiness;
    }

    public String getTouXiangUrl() {
        return touXiangUrl;
    }

    public void setTouXiangUrl(String touXiangUrl) {
        this.touXiangUrl = touXiangUrl == null ? null : touXiangUrl.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
}