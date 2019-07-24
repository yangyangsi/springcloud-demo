package com.hand.demo.controller;

import com.hand.demo.model.student.Student;
import com.hand.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/getAllStudent")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable String id){
        return studentService.getStuentById(id);
    }
}
