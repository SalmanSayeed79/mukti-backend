package com.mukti.muktibackend.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="course_user")
public class CourseUser {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "course_user_id", nullable = false)
    private Long course_user_id;

    @Column(name="course_id")
    private Long course_id;

    @Column(name="user_id")
    private Long user_id;

    @Column(name="status")
    private String status;

    @Column(name="completed")
    private Boolean completed;

    public CourseUser(){}

    public CourseUser(Long course_user_id, Long course_id, Long user_id, String status, Boolean completed) {
        this.course_user_id = course_user_id;
        this.course_id = course_id;
        this.user_id = user_id;
        this.status = status;
        this.completed = completed;
    }

    public Long getCourse_user_id() {
        return course_user_id;
    }

    public void setCourse_user_id(Long course_user_id) {
        this.course_user_id = course_user_id;
    }

    public Long getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Long course_id) {
        this.course_id = course_id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }
}
