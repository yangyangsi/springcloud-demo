package com.hand.demo.controller;

import com.hand.demo.model.teacher.Teacher;
import com.hand.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @RequestMapping("/getAllTeachers")
    public List<Teacher> getAllTeachers(){
        return teacherService.getAllTeacher();
    }

    @GetMapping("/{id}")
    public Teacher getTeacherById(@PathVariable String id){
        return teacherService.getTeacherById(id);
    }
}
