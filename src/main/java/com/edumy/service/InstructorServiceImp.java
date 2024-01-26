package com.edumy.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edumy.dto.CourseDTO;
import com.edumy.dto.InstructorDTO;
import com.edumy.entity.Course;
import com.edumy.entity.Instructor;
import com.edumy.repository.CourseRepository;
import com.edumy.repository.InstructorRepository;

@Service
public class InstructorServiceImp implements InstructorService {
    @Autowired InstructorRepository instructorRepository;
    @Autowired CourseRepository courseRepository;

    @Override
    public InstructorDTO addInstructor(InstructorDTO instructorDTO) {
        Instructor instructor = InstructorDTO.ValueOf(instructorDTO);
        instructorRepository.save(instructor);
        return InstructorDTO.getDTO(instructor);
    }

    @Override
    public String deleteInstructor(int instructorId) {
        Instructor instructor = instructorRepository.findById(instructorId).orElse(null);
        if(instructor != null) {
            for(Course course: instructor.getCourses()) {
                course.getInstructors().remove(instructor);
            }
            instructor.getCourses().clear();
            instructorRepository.delete(instructor);
        }
        return "Instructor with id: " + instructorId + " deleted successfully!";
    }

    @Override
    public InstructorDTO updateInstructor(InstructorDTO instructorDTO, int instructorId) {
        Instructor instructor = InstructorDTO.ValueOf(instructorDTO);
        instructorRepository.save(instructor);
        return InstructorDTO.getDTO(instructor);
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

    @Override
    public InstructorDTO assignCourse(int instructorId, int courseId) {
        Course course = courseRepository.findById(courseId).orElse(null);
        Instructor instructor = instructorRepository.findById(instructorId).orElse(null);

        instructor.getCourses().add(course);
        course.getInstructors().add(instructor);

        instructorRepository.save(instructor);

        return InstructorDTO.getDTO(instructor);
    }

    @Override
    public InstructorDTO addCourseToInstructor(CourseDTO courseDTO, int instructorId) {
        Instructor instructor = instructorRepository.findById(instructorId).orElse(null);
        Course course = CourseDTO.ValueOf(courseDTO);

        instructor.getCourses().add(course);
        instructorRepository.save(instructor);
        course.getInstructors().add(instructor);
        return InstructorDTO.getDTO(instructor);
    }
    
}
