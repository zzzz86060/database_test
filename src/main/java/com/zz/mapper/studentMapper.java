package com.zz.mapper;

import com.zz.pojo.STUDENT;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
@Mapper
public interface studentMapper {
    @Insert("insert into STUDENT(SNO,SNAME,SSEX,SBIRTHDAY,SPECIALITY,SCLASS,TC) values(#{STUDENT.SNO},#{STUDENT.sname},#{STUDENT.ssex},#{STUDENT.sbirthday},#{STUDENT.speciality},#{STUDENT.SCLASS},#{STUDENT.TC})")
     int addStudent(@Param(value = "STUDENT")  STUDENT student);
    @Select("select * from STUDENT")
    List<STUDENT> getAllStudent();
    @Select("select * from STUDENT where sno = #{sno}")
    STUDENT getOneStudent(@Param(value = "sno") BigDecimal sno);
    @Delete("delete from STUDENT where sno = ${sno}")
    int deleteStudent(@Param(value = "sno") BigDecimal sno);
    @Update("update STUDENT set TC=#{TC} where SNO=#{SNO}")
    int updaleteStudent(@Param("SNO") BigDecimal sno,@Param("TC") BigDecimal TC);
    @Select("")
    int findcourseAndSCORE(STUDENT student);

}





