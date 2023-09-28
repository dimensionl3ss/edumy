package com.edumy.service;

import java.util.List;

import com.edumy.dto.CourseDTO;
import com.edumy.entity.Course;

public interface CourseService {
    
    List<CourseDTO> getCourses();
    String addCourse(CourseDTO courseDTO);
    CourseDTO getCourseById(int courseId);
    String updateCourseById(int courseId);
    String deleteCourseId(int courseId);

}
