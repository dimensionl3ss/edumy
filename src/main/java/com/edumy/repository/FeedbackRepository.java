package com.edumy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edumy.entity.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback,Integer>{
    
}
