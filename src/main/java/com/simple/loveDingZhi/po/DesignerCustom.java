package com.simple.loveDingZhi.po;

/**
 * Created by simple on 2016/12/11.
 * 定制设计师的数据
 */
public class DesignerCustom extends User {
    private Integer id;
    private Integer userId;
    private String introduction;
    private Integer worksCount;
    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Integer getWorksCount() {
        return worksCount;
    }

    public void setWorksCount(Integer worksCount) {
        this.worksCount = worksCount;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
