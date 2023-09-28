package com.edumy.dto;

import com.edumy.entity.Review;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ReviewDTO {
    private Integer reviewId;
    private Double rating;
    private String review;
    @JsonProperty("course")
    private CourseDTO courseDTO;
    
    public Double getRating() {
        return rating;
    }
    public void setRating(Double rating) {
        this.rating = rating;
    }
    public String getReview() {
        return review;
    }
    public void setReview(String review) {
        this.review = review;
    }
    public CourseDTO getCourseDTO() {
        return courseDTO;
    }
    public void setCourseDTO(CourseDTO courseDTO) {
        this.courseDTO = courseDTO;
    }
    public Integer getReviewId() {
        return reviewId;
    }
    public void setReviewId(Integer reviewId) {
        this.reviewId = reviewId;
    }
    public static Review ValueOf(ReviewDTO reviewDTO) {
        Review review = new Review();
        review.setReviewId(reviewDTO.getReviewId());
        review.setRating(reviewDTO.getRating());
        review.setReview(reviewDTO.getReview());
        review.setCourse(CourseDTO.ValueOf(reviewDTO.getCourseDTO()));
        return review;
    } 
    public static ReviewDTO getDTO(Review review) {
        ReviewDTO reviewDTO = new ReviewDTO();
        reviewDTO.setReviewId(review.getReviewId());
        reviewDTO.setRating(review.getRating());
        reviewDTO.setReview(review.getReview());
        reviewDTO.setCourseDTO(CourseDTO.getDTO(review.getCourse()));
        return reviewDTO;
    }
}
