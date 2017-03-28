package com.simple.loveDingZhi.mapper;

import com.simple.loveDingZhi.po.BusinessLogo;
import com.simple.loveDingZhi.po.BusinessLogoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BusinessLogoMapper {
    int countByExample(BusinessLogoExample example);

    int deleteByExample(BusinessLogoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BusinessLogo record);

    int insertSelective(BusinessLogo record);

    List<BusinessLogo> selectByExampleWithBLOBs(BusinessLogoExample example);

    List<BusinessLogo> selectByExample(BusinessLogoExample example);

    BusinessLogo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BusinessLogo record, @Param("example") BusinessLogoExample example);

    int updateByExampleWithBLOBs(@Param("record") BusinessLogo record, @Param("example") BusinessLogoExample example);

    int updateByExample(@Param("record") BusinessLogo record, @Param("example") BusinessLogoExample example);

    int updateByPrimaryKeySelective(BusinessLogo record);

    int updateByPrimaryKeyWithBLOBs(BusinessLogo record);

    int updateByPrimaryKey(BusinessLogo record);
    /**************************************************************************************************/
    List<BusinessLogo> selectListOnePage(int pageFirst);//page为第几页
    List<BusinessLogo> selectListByUserName(String userName);//根据用户名获得用户自己的商城的logo列表
}