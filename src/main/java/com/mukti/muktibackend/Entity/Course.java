package com.mukti.muktibackend.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "bot_id", nullable = false)
    private Long course_id;

    @Column(name="track_id")
    private Long track_id;

    @Column(name="course_name")
    private String course_name;

    @Column(name="course_name_bangla")
    private String course_name_bangla;

    @Column(name="description")
    private String description;

    @Column(name="description_bangla")
    private String description_bangla;

    @Column(name="image")
    private String image;

    public Course(){}

    public Course(Long course_id, Long track_id, String course_name, String course_name_bangla, String description, String description_bangla, String image) {
        this.course_id = course_id;
        this.track_id = track_id;
        this.course_name = course_name;
        this.course_name_bangla = course_name_bangla;
        this.description = description;
        this.description_bangla = description_bangla;
        this.image = image;
    }


    public String getCourse_name_bangla() {
        return course_name_bangla;
    }

    public void setCourse_name_bangla(String course_name_bangla) {
        this.course_name_bangla = course_name_bangla;
    }

    public String getDescription_bangla() {
        return description_bangla;
    }

    public void setDescription_bangla(String description_bangla) {
        this.description_bangla = description_bangla;
    }

    public Long getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Long course_id) {
        this.course_id = course_id;
    }

    public Long getTrack_id() {
        return track_id;
    }

    public void setTrack_id(Long track_id) {
        this.track_id = track_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
