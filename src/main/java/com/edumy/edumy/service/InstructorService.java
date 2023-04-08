package com.edumy.edumy.service;

import java.util.List;

import com.edumy.edumy.dto.InstructorDTO;

public interface InstructorService {
    List<InstructorDTO> getInstructorByCourseId(int courseId);
    String addInstructor(InstructorDTO instructorDTO);
    String deleteInstructor(int instructorId);
    String updateInstructor(int instructorId);
}
