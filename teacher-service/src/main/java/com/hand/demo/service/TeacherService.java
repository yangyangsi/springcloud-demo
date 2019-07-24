package com.hand.demo.service;

import com.hand.demo.mapper.TeacherMapper;
import com.hand.demo.model.teacher.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    public List<Teacher> getAllTeacher(){
        return teacherMapper.getAllTeachers();
    }

    public Teacher getTeacherById(String id){
        return teacherMapper.getTeacherById(id);
    }
}
