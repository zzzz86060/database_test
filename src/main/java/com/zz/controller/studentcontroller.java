package com.zz.controller;

import com.zz.mapper.courseMapper;
import com.zz.mapper.scoreMapper;
import com.zz.pojo.STUDENT;
import com.zz.pojo.StudentUpdateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import com.zz.service.studentService;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class studentcontroller {
    @Autowired
     private studentService service;
    @Resource
    scoreMapper mapper1;
    @Resource
    courseMapper mapper2;

    @RequestMapping("/getAll")
    public List<STUDENT> getAllStudents(){
        return service.getAllStudent();
    }
    @RequestMapping("/delete")
    public boolean deleteStudent(@RequestBody BigDecimal sno){
       int cnt =  service.deleteStudent(sno);
       return cnt > 0;
    }
    @RequestMapping( "/getone")
   public STUDENT getOneStudent(@RequestBody BigDecimal sno){
        return service.getOneStudent(sno);
    }
    @RequestMapping("/add")
    public boolean addStudent(@RequestBody STUDENT student) throws ParseException {
        int cnt =  service.addStudent(student);
        return cnt > 0;
    }

    @RequestMapping("/update")
    public STUDENT updaleteStudent(@RequestBody StudentUpdateRequest request) {
        int cnt = service.updaleteStudent(request.getSNO(), request.getTC());
        if(cnt > 0){
            return service.getOneStudent(request.getSNO());
        }
        else
            return null;
    }
@RequestMapping("/updateAll")
@Transactional
    public STUDENT updateAll(@RequestBody STUDENT student){
        int cnt = service.updaleteAll(student);
        if(cnt > 0)
            return service.getOneStudent(student.getSNO());
        else
            return null;
    }

    @RequestMapping("/getAllScore")
    public Object getAll() {
        return mapper1.getAll();
    }

    @RequestMapping("/getAllCourse")
    public Object getCourse() {
        return mapper2.getLists();
    }
}
