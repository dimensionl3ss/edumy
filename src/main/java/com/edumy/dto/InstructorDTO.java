package com.edumy.dto;

import com.edumy.entity.Instructor;

public class InstructorDTO {
    
    private Integer id;
    private String instructorName;
    private String instructorEmail;
    private Long mobile;
    private String address;
    private Integer pincode;
    private String state;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getInstructorName() {
        return instructorName;
    }
    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }
    public String getInstructorEmail() {
        return instructorEmail;
    }
    public void setInstructorEmail(String instructorEmail) {
        this.instructorEmail = instructorEmail;
    }
    public Long getMobile() {
        return mobile;
    }
    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Integer getPincode() {
        return pincode;
    }
    public void setPincode(Integer pincode) {
        this.pincode = pincode;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public static Instructor ValueOf(InstructorDTO instructorDTO) {
        Instructor instructor = new Instructor();
        instructor.setId(instructorDTO.getId());
        instructor.setInstructorName(instructorDTO.getInstructorName());
        instructor.setInstructorEmail(instructorDTO.getInstructorEmail());
        instructor.setAddress(instructorDTO.getAddress());
        instructor.setMobile(instructorDTO.getMobile());
        instructor.setPincode(instructorDTO.getPincode());
        instructor.setState(instructorDTO.getState());
        instructor.setInstructorName(instructorDTO.getInstructorName());
        return instructor;
    }
    public static InstructorDTO getDTO(Instructor instructor) {
        InstructorDTO instructorDTO = new InstructorDTO();
        instructorDTO.setId(instructor.getId());
        instructorDTO.setInstructorName(instructor.getInstructorName());
        instructorDTO.setInstructorEmail(instructor.getInstructorEmail());
        instructorDTO.setAddress(instructor.getAddress());
        instructorDTO.setMobile(instructor.getMobile());
        instructorDTO.setPincode(instructor.getPincode());
        instructorDTO.setState(instructor.getState());
        instructorDTO.setInstructorName(instructor.getInstructorName());
        return instructorDTO;
    }
}
