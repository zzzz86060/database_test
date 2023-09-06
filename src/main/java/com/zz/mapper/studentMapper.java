package com.zz.mapper;

import com.zz.pojo.STUDENT;

import java.util.List;

public interface studentMapper {
    int addStudent();
    List<STUDENT> getAllStudent();
    STUDENT getOneStudent(int sno);
    int deleteStudent(int sno);
    int updateStudent(STUDENT student);
}
