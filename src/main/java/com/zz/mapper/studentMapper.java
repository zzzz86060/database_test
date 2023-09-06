package com.zz.mapper;

import com.zz.pojo.STUDENT;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

import java.util.List;
@Mapper
public interface studentMapper {
    @Insert(" insert into STUDENT (sno,sname,ssex,sbirthday,speciality,sclass,tc) values(#{sno},#{sname},#{ssex},#{sbirthday},#{speciality},#{sclass},#{tc})")
    int addStudent(@Param(value = "STUDENT") STUDENT student);
    @Select("select * from STUDENT")
    List<STUDENT> getAllStudent();
    @Select("select * from STUDENT where sno = #{sno}")
    STUDENT getOneStudent(@Param(value = "sno") int sno);
    @Delete("delete from STUDENT where sno = #{sno}")
    int deleteStudent(@Param(value = "sno") int sno);
}
