package com.edumy.dto;

import com.edumy.entity.Feedback;

public class FeedbackDTO {
    private Integer feedbackId;
    private Double rating;
    private String feedback;
    private InstructorDTO instructorDTO;
    
    public Double getRating() {
        return rating;
    }
    public void setRating(Double rating) {
        this.rating = rating;
    }
    public String getFeedback() {
        return feedback;
    }
    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
    public InstructorDTO getInstructorDTO() {
        return instructorDTO;
    }
    public void setInstructorDTO(InstructorDTO instructorDTO) {
        this.instructorDTO = instructorDTO;
    }
    public Integer getFeedbackId() {
        return feedbackId;
    }
    public void setFeedbackId(Integer feedbackId) {
        this.feedbackId = feedbackId;
    }
    public static Feedback ValueOf(FeedbackDTO feedbackDTO) {
        Feedback feedback = new Feedback();
        feedback.setFeedbackId(feedbackDTO.getFeedbackId());
        feedback.setRating(feedbackDTO.getRating());
        feedback.setFeedback(feedbackDTO.getFeedback());
        feedback.setInstructor(InstructorDTO.ValueOf(feedbackDTO.getInstructorDTO()));
        return feedback;
    } 
    public static FeedbackDTO getDTO(Feedback feedback) {
        FeedbackDTO feedbackDTO = new FeedbackDTO();
        feedbackDTO.setFeedbackId(feedback.getFeedbackId());
        feedbackDTO.setRating(feedback.getRating());
        feedbackDTO.setFeedback(feedback.getFeedback());
        feedbackDTO.setInstructorDTO(InstructorDTO.getDTO(feedback.getInstructor()));
        return feedbackDTO;
    }
}
