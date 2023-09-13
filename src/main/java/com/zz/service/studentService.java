package com.zz.service;

import com.zz.pojo.STUDENT;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

public interface studentService {
    List<STUDENT> getAllStudent();
    STUDENT getOneStudent(BigDecimal sno);
    int deleteStudent(BigDecimal sno);
    int addStudent( STUDENT student);
    int updaleteStudent(BigDecimal sno, BigDecimal TC);
    int updaleteAll(STUDENT student);
}
