package com.zz.mapper;

import com.zz.pojo.SCORE;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Scanner;

@Mapper
public interface scoreMapper {
    @Select("select * from SS.SCORE")
    List<SCORE> getAll();
}
