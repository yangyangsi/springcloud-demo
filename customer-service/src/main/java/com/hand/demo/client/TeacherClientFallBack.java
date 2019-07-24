package com.hand.demo.client;

import com.hand.demo.model.teacher.Teacher;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TeacherClientFallBack implements TeacherClient{
    @Override
    public List<Teacher> getAllTeachers() {
        List<Teacher> teacherList = new ArrayList<>();
        Teacher teacher = new Teacher();
        teacher.setId("09");
        teacher.setId("老虎");
        teacherList.add(teacher);
        return teacherList;
    }
}
