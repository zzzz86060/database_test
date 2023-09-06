package com.zz.service.ImpI;

import com.zz.mapper.studentMapper;
import com.zz.pojo.STUDENT;
import com.zz.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class studentServiceImpI implements studentService {
    @Autowired
    studentMapper studentMapper;
    @Override
    public List<STUDENT> getAllStudent() {
        return studentMapper.getAllStudent();
    }
}
