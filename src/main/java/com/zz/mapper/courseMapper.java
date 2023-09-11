package com.zz.mapper;

import com.zz.pojo.COURSE;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface courseMapper {
    @Select("select * from COURSE")
    List<COURSE> getLists() ;
}
