package com.edumy.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;

import com.edumy.dto.CourseDTO;
import com.edumy.dto.InstructorDTO;
import com.edumy.service.InstructorService;

@RestController
@RequestMapping("/instructors")
public class InstructorController {
    @Autowired private InstructorService instructorService;
    @GetMapping
    public ResponseEntity<List<InstructorDTO>> getInstructors() {
        return ResponseEntity.ok(instructorService.getInstructors());                  
    }

    @PostMapping
    public ResponseEntity<InstructorDTO> addInstructor(@RequestBody InstructorDTO instructorDTO) {
        return ResponseEntity.ok(instructorService.addInstructor(instructorDTO));                  
    }

    @GetMapping("/{instructorId}")
    public ResponseEntity<InstructorDTO>  getInstructorById(@PathVariable Integer instructorId) {
        return ResponseEntity.ok(instructorService.getInstructorById(instructorId));
    }

    @GetMapping("/{instructorId}/courses")
    public ResponseEntity<List<CourseDTO>> getCoursesByInstructorId(@PathVariable int instructorId) {
        return ResponseEntity.ok(instructorService.getCoursesByInstructorId(instructorId));

    }

    @DeleteMapping("/{instructorId}")
    public ResponseEntity<String> deleteInstructor(@PathVariable int instructorId) {
        return ResponseEntity.ok(instructorService.deleteInstructor(instructorId));
    }
    
    @PutExchange("/{instructorId}")
    public ResponseEntity<InstructorDTO> updateInstructor(@RequestBody InstructorDTO instructorDTO, @PathVariable int instructorId) {
        return ResponseEntity.ok(instructorService.updateInstructor(instructorDTO,instructorId));
    }

    @PostMapping("/{instructorId}/courses/{courseId}")
    public ResponseEntity<InstructorDTO> assignCourse(@PathVariable int instructorId, @PathVariable int courseId) {
        return ResponseEntity.ok(instructorService.assignCourse(instructorId, courseId));
    }
}
