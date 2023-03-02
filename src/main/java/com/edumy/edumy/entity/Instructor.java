package com.edumy.edumy.entity;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
@Entity
@Table(name = "instructors")
public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "instructor_id")
    private Integer id;
    @Column(name = "instructor_name")
    private String instructorName;
    private Long mobile;
    private String address;
    private Integer pincode;
    private String state;

    @ManyToMany(fetch = FetchType.LAZY,
      cascade = {
          CascadeType.ALL
    },
    mappedBy = "instructors")
    @JsonIgnore
    private List<Course> courses = new ArrayList<>();

    public Integer getInstructorId() {
        return id;
    }
    public void setInstructorId(Integer id) {
        this.id = id;
    }
    public String getInstructorName() {
        return instructorName;
    }
    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
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
    public List<Course> getCourses() {
        return courses;
    }
    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
    public Instructor() {

    }

}
