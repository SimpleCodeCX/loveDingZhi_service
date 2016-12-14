package com.simple.loveDingZhi.po;

import java.util.List;

/**
 * Created by simple on 2016/12/14.
 * 设计师的数据，包含别的表的数据结构
 */
public class DesignerVo extends Designer{
    User user;
    List<DesignDrawingExtend> designDrawingExtendList;//设计师的设计稿列表

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<DesignDrawingExtend> getDesignDrawingExtendList() {
        return designDrawingExtendList;
    }

    public void setDesignDrawingExtendList(List<DesignDrawingExtend> designDrawingExtendList) {
        this.designDrawingExtendList = designDrawingExtendList;
    }
}
