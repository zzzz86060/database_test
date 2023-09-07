package com.zz.controller;

import com.zz.pojo.STUDENT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.zz.service.studentService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class studentcontroller {
    @Autowired
     private studentService service;
    @RequestMapping("/getAll")
    public List<STUDENT> getAllStudents(){
        return service.getAllStudent();
    }
    @RequestMapping("delete")
    public boolean deleteStudent(int sno){
       int cnt =  service.deleteStudent(sno);
       return cnt > 0;
    }
    @RequestMapping("/getone")
   public STUDENT getOneStudent(int sno){
        return service.getOneStudent(sno);
    }
    @RequestMapping("/add")
    public boolean addStudent(@RequestBody STUDENT student) throws ParseException {
        int cnt =  service.addStudent(student);
        return cnt > 0;
    }
}
