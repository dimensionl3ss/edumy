package com.edumy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edumy.entity.Instructor;

public interface InstructorRepository extends JpaRepository<Instructor, Integer>{
    
}
