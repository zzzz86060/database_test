package com.zz.controller;

import com.zz.pojo.STUDENT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.zz.service.studentService;

import java.util.List;

@RestController
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
    public boolean addStudent(STUDENT student){
        int cnt =  service.addStudent(student);
        return cnt > 0;
    }
}
