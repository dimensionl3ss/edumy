package com.edumy.edumy.service;

import java.util.List;

import com.edumy.edumy.dto.CourseDTO;
import com.edumy.edumy.entity.Course;

public interface CourseService {
    
    List<CourseDTO> getCourses();
    String addCourse(CourseDTO courseDTO);
    Course getCourseById(int courseId);
    String updateCourseById(int courseId);
    String deleteCourseId(int courseId);

}
