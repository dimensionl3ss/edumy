package com.edumy.service;

import java.util.List;

import com.edumy.dto.CourseDTO;
import com.edumy.dto.InstructorDTO;

public interface InstructorService {
    List<CourseDTO> getCoursesByInstructorId(int instructorId);
    InstructorDTO getInstructorById(int instructorId);
    List<InstructorDTO> getInstructors();
    InstructorDTO addInstructor(InstructorDTO instructorDTO);
    String deleteInstructor(int instructorId);
    InstructorDTO updateInstructor(InstructorDTO instructorDTO, int instructorId);
    InstructorDTO assignCourse(int instructorId, int courseId);
    InstructorDTO addCourseToInstructor(CourseDTO courseDTO, int instructorId);
}
