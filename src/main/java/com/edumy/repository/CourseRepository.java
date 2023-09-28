package com.edumy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edumy.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer>{
    
}
