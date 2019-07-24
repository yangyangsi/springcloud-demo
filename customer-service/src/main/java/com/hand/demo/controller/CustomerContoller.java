package com.hand.demo.controller;

import com.hand.demo.client.TeacherClient;
import com.hand.demo.model.teacher.Teacher;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@DefaultProperties(defaultFallback = "error")
@RestController
@RequestMapping("/customer")
public class CustomerContoller {
    @Autowired
    private TeacherClient teacherClient;


    @RequestMapping("/getAll")
    public List<Teacher> getAllTeachers(){
        return teacherClient.getAllTeachers();
    }

}
