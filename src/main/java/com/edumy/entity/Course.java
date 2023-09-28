package com.edumy.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "courses")
public class Course {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id")
    private Integer id;
    @Column(name = "course_name")
    private String courseName;
    private String description;
    private String level;

    // @OneToMany(fetch = FetchType.LAZY)
    // @JoinColumn(name = "review_id")
    // @OnDelete(action = OnDeleteAction.CASCADE)
    // private List<Review> reviews;
    
    @ManyToMany(fetch = FetchType.LAZY,
      cascade = {
          CascadeType.ALL
      })
    @JoinTable(name = "courses_by_instructors",
        joinColumns = { @JoinColumn(name = "course_id") },
        inverseJoinColumns = { @JoinColumn(name = "instructor_id") })
    private List<Instructor> instructors = new ArrayList<>();
    private Integer price;
    @Column(name = "duration_in_weeks")  
    private Integer durationInWeeks;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getCourseName() {
        return courseName;
    }
    public List<Instructor> getInstructors() {
        return instructors;
    }
    public void setInstructors(List<Instructor> instructors) {
        this.instructors = instructors;
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
    // public List<Review> getReviews() {
    //     return reviews;
    // }
    // public void setReviews(List<Review> reviews) {
    //     this.reviews = reviews;
    // }
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
    public Course() {
    }
    
}
