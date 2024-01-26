package com.edumy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edumy.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer>{
    
}
