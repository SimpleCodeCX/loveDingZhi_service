package com.simple.loveDingZhi.mapper;

import com.simple.loveDingZhi.po.BusinessCloth;
import com.simple.loveDingZhi.po.BusinessClothExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BusinessClothMapper {
    int countByExample(BusinessClothExample example);

    int deleteByExample(BusinessClothExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BusinessCloth record);

    int insertSelective(BusinessCloth record);

    List<BusinessCloth> selectByExampleWithBLOBs(BusinessClothExample example);

    List<BusinessCloth> selectByExample(BusinessClothExample example);

    BusinessCloth selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BusinessCloth record, @Param("example") BusinessClothExample example);

    int updateByExampleWithBLOBs(@Param("record") BusinessCloth record, @Param("example") BusinessClothExample example);

    int updateByExample(@Param("record") BusinessCloth record, @Param("example") BusinessClothExample example);

    int updateByPrimaryKeySelective(BusinessCloth record);

    int updateByPrimaryKeyWithBLOBs(BusinessCloth record);

    int updateByPrimaryKey(BusinessCloth record);
    /**************************************************************************************************/
    List<BusinessCloth> selectListOnePage(int pageFirst);//page为第几页
    List<BusinessCloth> selectListByUserName(String userName);//根据用户名获得用户自己的商城的衣服列表
}