package com.hand.demo.service;

import com.hand.demo.mapper.StudentMapper;
import com.hand.demo.model.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentMapper studentMapper;

    public List<Student> getAllStudent(){
        return studentMapper.getAllStudents();
    }

    public Student getStuentById(String id){
        return studentMapper.getStudentById(id);
    }
}
