package com.zz.service;

import com.zz.pojo.STUDENT;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

public interface studentService {
    List<STUDENT> getAllStudent();
    STUDENT getOneStudent(int sno);
    int deleteStudent(int sno);
    int addStudent( STUDENT student);
}
