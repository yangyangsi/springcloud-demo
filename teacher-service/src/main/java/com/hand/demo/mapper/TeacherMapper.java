package com.hand.demo.mapper;

import com.hand.demo.model.teacher.Teacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TeacherMapper {
    List<Teacher> getAllTeachers();
    Teacher getTeacherById(String id);
}
