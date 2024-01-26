package com.edumy.service;

import java.util.List;

import com.edumy.dto.CourseDTO;
import com.edumy.dto.InstructorDTO;

public interface InstructorService {
    List<CourseDTO> getCoursesByInstructorId(int instructorId);
    InstructorDTO getInstructorById(int instructorId);
    List<InstructorDTO> getInstructors();
    String addInstructor(InstructorDTO instructorDTO);
    String deleteInstructor(int instructorId);
    String updateInstructor(int instructorId);
}
