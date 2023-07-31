package com.mukti.muktibackend.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="faq")
public class FAQ {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "faq_id", nullable = false)
    private Long faq_id;

    @Column(name = "course_id")
    private Long course_id;

    @Column(name="title")
    private String title;
    @Column(name="title_bangla")
    private String title_bangla;

    @Column(name="description")
    private String description;

    @Column(name="description_bangla")
    private String description_bangla;

    public FAQ(){}

    public FAQ(Long faq_id, Long course_id, String title, String title_bangla, String description, String description_bangla) {
        this.faq_id = faq_id;
        this.course_id = course_id;
        this.title = title;
        this.title_bangla = title_bangla;
        this.description = description;
        this.description_bangla = description_bangla;
    }

    public Long getFaq_id() {
        return faq_id;
    }

    public void setFaq_id(Long faq_id) {
        this.faq_id = faq_id;
    }

    public Long getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Long course_id) {
        this.course_id = course_id;
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
