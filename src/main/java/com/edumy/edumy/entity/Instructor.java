package com.edumy.edumy.entity;
import java.util.List;

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
    private Integer instructorId;
    @Column(name = "instructor_name")
    private String instructorName;
    private Long mobile;
    private String address;
    private Integer pincode;
    private String state;

    @ManyToMany(fetch = FetchType.LAZY,
      cascade = {
          CascadeType.PERSIST,
          CascadeType.MERGE
      },
      mappedBy = "instructors")
    private List<Course> courses;

    // @OneToMany(fetch = FetchType.LAZY)
    // @JoinColumn(name = "feedback_id")
    // @OnDelete(action = OnDeleteAction.CASCADE)
    // private List<Feedback> feedbacks;
    public Integer getInstructorId() {
        return instructorId;
    }
    public void setInstructorId(Integer instructorId) {
        this.instructorId = instructorId;
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
    // public List<Feedback> getFeedbacks() {
    //     return feedbacks;
    // }
    // public void setFeedbacks(List<Feedback> feedbacks) {
    //     this.feedbacks = feedbacks;
    // }
    public Instructor() {

    }

}
