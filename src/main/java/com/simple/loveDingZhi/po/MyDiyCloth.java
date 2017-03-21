package com.simple.loveDingZhi.po;

public class MyDiyCloth {
    private Integer myDiyClothId;

    private Integer userId;

    private Integer businessClothId;

    private Integer logoId;

    private Boolean isBusinessLogo;

    private String diyImgUrl;

    public Integer getMyDiyClothId() {
        return myDiyClothId;
    }

    public void setMyDiyClothId(Integer myDiyClothId) {
        this.myDiyClothId = myDiyClothId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getBusinessClothId() {
        return businessClothId;
    }

    public void setBusinessClothId(Integer businessClothId) {
        this.businessClothId = businessClothId;
    }

    public Integer getLogoId() {
        return logoId;
    }

    public void setLogoId(Integer logoId) {
        this.logoId = logoId;
    }

    public Boolean getIsBusinessLogo() {
        return isBusinessLogo;
    }

    public void setIsBusinessLogo(Boolean isBusinessLogo) {
        this.isBusinessLogo = isBusinessLogo;
    }

    public String getDiyImgUrl() {
        return diyImgUrl;
    }

    public void setDiyImgUrl(String diyImgUrl) {
        this.diyImgUrl = diyImgUrl == null ? null : diyImgUrl.trim();
    }
}