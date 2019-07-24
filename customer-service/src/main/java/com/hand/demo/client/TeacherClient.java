package com.hand.demo.client;

import com.hand.demo.model.teacher.Teacher;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(value = "teacher-service",fallback = TeacherClientFallBack.class)
public interface TeacherClient {
    @RequestMapping("/teacher/getAllTeachers")
    List<Teacher> getAllTeachers();
}
