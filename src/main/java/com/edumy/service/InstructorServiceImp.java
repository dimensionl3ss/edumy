package com.edumy.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edumy.dto.CourseDTO;
import com.edumy.dto.InstructorDTO;
import com.edumy.entity.Course;
import com.edumy.entity.Instructor;
import com.edumy.repository.InstructorRepository;

@Service
public class InstructorServiceImp implements InstructorService {
    @Autowired InstructorRepository instructorRepository;

    @Override
    public String addInstructor(InstructorDTO instructorDTO) {
        Instructor instructor = InstructorDTO.ValueOf(instructorDTO);
        instructorRepository.save(instructor);
        return "Instructor with id: " + instructor.getId() + " added successfully!";
    }

    @Override
    public String deleteInstructor(int instructorId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteInstructor'");
    }

    @Override
    public String updateInstructor(int instructorId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateInstructor'");
    }

    @Override
    public List<InstructorDTO> getInstructors() {
        List<Instructor> instructors = instructorRepository.findAll();
        List<InstructorDTO> instructorDTOs = instructors.stream().map(instructor -> InstructorDTO.getDTO(instructor)).collect(Collectors.toList());
        return instructorDTOs;
    }

    @Override
    public InstructorDTO getInstructorById(int instructorId) {
        Instructor instructor = instructorRepository.findById(instructorId).orElse(null);
        return InstructorDTO.getDTO(instructor);
    }

    @Override
    public List<CourseDTO> getCoursesByInstructorId(int instructorId) {
        Instructor instructor = instructorRepository.findById(instructorId).orElse(null);
        List<Course> courses = instructor.getCourses();
        return courses.stream().map(course -> CourseDTO.getDTO(course)).collect(Collectors.toList());
    }
    
}
