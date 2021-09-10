package com.example.dataanalysis.mapper;

import com.example.dataanalysis.basic.VpnUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface VpnUserDao {
    int deleteByPrimaryKey(String id);

    int insert(VpnUser record);

    int insertSelective(VpnUser record);

    VpnUser selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(VpnUser record);

    int updateByPrimaryKey(VpnUser record);
}
