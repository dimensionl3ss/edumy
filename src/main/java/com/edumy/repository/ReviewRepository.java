package com.edumy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edumy.entity.Review;

public interface ReviewRepository extends JpaRepository<Review, Integer>{
    
}
