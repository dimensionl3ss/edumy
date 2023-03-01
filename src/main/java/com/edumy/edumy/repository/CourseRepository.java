package com.edumy.edumy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edumy.edumy.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer>{
    
}
