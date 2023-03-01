package com.edumy.edumy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edumy.edumy.entity.Instructor;

public interface InstructorRepository extends JpaRepository<Instructor, Integer>{
    
}
