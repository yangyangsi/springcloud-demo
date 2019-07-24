package com.hand.demo.mapper;

import com.hand.demo.model.student.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {
    List<Student> getAllStudents();
    Student getStudentById(String id);
}
