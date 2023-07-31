package com.mukti.muktibackend.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="video")
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "video_id", nullable = false)
    private Long video_id;

    @Column(name = "course_id")
    private Long course_id;

    @Column(name="title")
    private String title;
    @Column(name="title_bangla")
    private String title_bangla;

    @Column(name="link")
    private String link;

    @Column(name="description")
    private String description;

    @Column(name="description_bangla")
    private String description_bangla;

    public Video(){}


    public Video(Long video_id, Long course_id, String title, String title_bangla, String link, String description, String description_bangla) {
        this.video_id = video_id;
        this.course_id = course_id;
        this.title = title;
        this.title_bangla = title_bangla;
        this.link = link;
        this.description = description;
        this.description_bangla = description_bangla;
    }

    public Long getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Long course_id) {
        this.course_id = course_id;
    }

    public Long getVideo_id() {
        return video_id;
    }

    public void setVideo_id(Long video_id) {
        this.video_id = video_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle_bangla() {
        return title_bangla;
    }

    public void setTitle_bangla(String title_bangla) {
        this.title_bangla = title_bangla;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription_bangla() {
        return description_bangla;
    }

    public void setDescription_bangla(String description_bangla) {
        this.description_bangla = description_bangla;
    }
}
