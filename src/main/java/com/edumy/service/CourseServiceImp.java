package com.edumy.service;

import java.util.List;
import java.util.stream.Collectors;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edumy.dto.CourseDTO;
import com.edumy.entity.Course;
import com.edumy.repository.CourseRepository;

@Service
public class CourseServiceImp implements CourseService{
    
    @Autowired 
    private CourseRepository courseRepository;

    @Override
    public List<CourseDTO> getCourses() {
        List<Course> courses = courseRepository.findAll();
        List<CourseDTO> courseDTOs = courses.stream().map(course -> CourseDTO.getDTO(course)).collect(Collectors.toList());
        return courseDTOs;
    }

    @Override
    public String addCourse(CourseDTO courseDTO){
        return null;
    }

    @Override
    public CourseDTO getCourseById(int courseId) {
        Course course = courseRepository.findById(courseId).orElse(null);
        return null;
    }

    @Override
    public String updateCourseById(int courseId) {
        return null;
    }

    @Override
    public String deleteCourseId(int courseId) {
        return null;
    }
}
