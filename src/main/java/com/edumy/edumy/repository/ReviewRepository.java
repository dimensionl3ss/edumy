package com.edumy.edumy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edumy.edumy.entity.Review;

public interface ReviewRepository extends JpaRepository<Review, Integer>{
    
}
