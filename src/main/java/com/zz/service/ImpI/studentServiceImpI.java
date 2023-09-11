package com.zz.service.ImpI;

import com.zz.mapper.studentMapper;
import com.zz.pojo.STUDENT;
import com.zz.service.studentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;
@Service
public class studentServiceImpI implements studentService {
    @Autowired
    studentMapper studentMapper;
    @Override
    public List<STUDENT> getAllStudent() {
        return studentMapper.getAllStudent();
    }

    @Override
    public STUDENT getOneStudent(BigDecimal sno) {
        return studentMapper.getOneStudent(sno);
    }

    @Override
    public int deleteStudent(BigDecimal sno) {
        return studentMapper.deleteStudent(sno);
    }




    @Override
    @Transactional
    public int addStudent(STUDENT student) {
        return studentMapper.addStudent(student);
    }

    @Override
    public int updaleteStudent(STUDENT student) {
        return studentMapper.updaleteStudent(student);
    }
}
