package com.edumy.edumy.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edumy.edumy.dto.CourseDTO;
import com.edumy.edumy.entity.Course;
import com.edumy.edumy.entity.Review;
import com.edumy.edumy.repository.CourseRepository;
import com.edumy.edumy.repository.ReviewRepository;
@RestController
@RequestMapping("/courses")
public class CourseController {
    @Autowired private CourseRepository courseRepository;
    @Autowired private ReviewRepository reviewRepository;
    @PostMapping
    Course addACourse(@RequestBody CourseDTO courseDTO) {
        Course course = CourseDTO.ValueOf(courseDTO);
        return courseRepository.save(course);
    }
    @GetMapping
    List<CourseDTO> getCourse() {
        List<Course> courses = courseRepository.findAll();
        List<CourseDTO> courseDTOs = courses.stream().map(course -> CourseDTO.getDTO(course)).collect(Collectors.toList());
        return courseDTOs;
    }
    @PostMapping("/{courseId}/reviews")
    Review addAReview(@PathVariable int courseId, @RequestBody Review review) {
        Review newReview = courseRepository.findById(courseId).map(course -> {
            review.setCourse(course);
            return reviewRepository.save(review);
        }).orElseThrow();
        return newReview;
    }

    @ExceptionHandler(Exception.class)
    String exceptionHandler(Exception e) {
        return e.getMessage();
    }

}