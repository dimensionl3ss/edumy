package com.edumy.edumy.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.edumy.edumy.entity.Course;
import com.edumy.edumy.entity.Instructor;


public class CourseDTO {
    
    private Integer id;
    private String courseName;
    private String description;
    private String level;

    private List<InstructorDTO> instructorDTOs = new ArrayList<>();
    private Integer price;
    private Integer durationInWeeks;
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getLevel() {
        return level;
    }
    public void setLevel(String level) {
        this.level = level;
    }
    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
    public Integer getDurationInWeeks() {
        return durationInWeeks;
    }
    public void setDurationInWeeks(Integer durationInWeeks) {
        this.durationInWeeks = durationInWeeks;
    }
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public List<InstructorDTO> getInstructorDTOs() {
        return instructorDTOs;
    }
    public void setInstructorDTOs(List<InstructorDTO> instructorDTOs) {
        this.instructorDTOs = instructorDTOs;
    }
    public CourseDTO() {
    }
    public static Course ValueOf(CourseDTO courseDTO) {
        Course course = new Course();
        course.setId(courseDTO.getId());
        course.setCourseName(courseDTO.getCourseName());
        course.setDescription(courseDTO.getDescription());
        course.setDurationInWeeks(courseDTO.getDurationInWeeks());
        course.setLevel(courseDTO.getLevel());
        course.setPrice(courseDTO.getPrice());
        List<Instructor> instructors = courseDTO.getInstructorDTOs().
                                        stream().
                                        map(dto -> InstructorDTO.ValueOf(dto))
                                        .collect(Collectors.toList());

        course.setInstructors(instructors);
        
        return course;
    }
    public static CourseDTO getDTO(Course course) {
        CourseDTO courseDTO = new CourseDTO();
        courseDTO.setId(course.getId());
        courseDTO.setCourseName(course.getCourseName());
        courseDTO.setDescription(course.getDescription());
        courseDTO.setDurationInWeeks(course.getDurationInWeeks());
        courseDTO.setLevel(course.getLevel());
        courseDTO.setPrice(course.getPrice());
        List<InstructorDTO> instructorDTOs = course.getInstructors().
                                        stream().
                                        map(instructor -> InstructorDTO.getDTO(instructor))
                                        .collect(Collectors.toList());

        courseDTO.setInstructorDTOs(instructorDTOs);
        return courseDTO;
    }

    
}
