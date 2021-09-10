package com.example.dataanalysis.mapper;

import com.example.dataanalysis.basic.VirusLog;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface VirusLogDao {
    int deleteByPrimaryKey(String id);

    int insert(VirusLog record);

    int insertSelective(VirusLog record);

    VirusLog selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(VirusLog record);

    int updateByPrimaryKey(VirusLog record);
}
