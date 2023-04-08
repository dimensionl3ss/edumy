package com.edumy.edumy.service;

import java.util.List;

import com.edumy.edumy.dto.ReviewDTO;

public interface ReviewService {
    List<ReviewDTO> getReviewByCourseId(int courseId);
    String addReview(ReviewDTO reviewDTO);
    String deleteReviewById(int reviewId);
}
