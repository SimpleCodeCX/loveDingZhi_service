package com.simple.loveDingZhi.service;

import com.simple.loveDingZhi.mapper.DesignDrawingMapper;
import com.simple.loveDingZhi.po.DesignDrawing;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by simple on 2016/12/11.
 */
public class DesignDrawingServiceImpl implements IDesignDrawingService{
    @Autowired
    private DesignDrawingMapper designDrawingMapper;
    public int insertSelectiveReturnId(DesignDrawing designDrawing) {
        return designDrawingMapper.insertSelectiveReturnId(designDrawing);
    }
    public DesignDrawing selectByPrimaryKey(Integer id) {
        return designDrawingMapper.selectByPrimaryKey(id);
    }

    public List<DesignDrawing> selectListOnePage(int page) {
        //page代表第几页，每一页10个
        int pageFirst=(page-1)*10;//计算出该页的第一条数据序号

        return designDrawingMapper.selectListOnePage(pageFirst);
    }

    public List<DesignDrawing> selectListByUserName(String userName) {
        return designDrawingMapper.selectListByUserName(userName);
    }
}
