package com.mukti.muktibackend.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="alumni")
public class Alumni {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "alumni_id", nullable = false)
    private Long alumni_id;

    @Column(name="course_id")
    private Long course_id;

    @Column(name="name")
    private String name;

    @Column(name="name_bangla")
    private String name_bangla;

    @Column(name="image")
    private String image;

    @Column(name="title")
    private String title;

    @Column(name="placed_company")
    private String placed_company;

    @Column(name="experience")
    private String experience;

    @Column(name="title_bangla")
    private String title_bangla;

    @Column(name="placed_company_bangla")
    private String placed_company_bangla;

    @Column(name="experience_bangla")
    private String experience_bangla;

    public Alumni(){}

    public Alumni(Long alumni_id, Long course_id, String name, String name_bangla, String image, String title, String placed_company, String experience, String title_bangla, String placed_company_bangla, String experience_bangla) {
        this.alumni_id = alumni_id;
        this.course_id = course_id;
        this.name = name;
        this.name_bangla = name_bangla;
        this.image = image;
        this.title = title;
        this.placed_company = placed_company;
        this.experience = experience;
        this.title_bangla = title_bangla;
        this.placed_company_bangla = placed_company_bangla;
        this.experience_bangla = experience_bangla;
    }

    public String getName_bangla() {
        return name_bangla;
    }

    public void setName_bangla(String name_bangla) {
        this.name_bangla = name_bangla;
    }

    public String getTitle_bangla() {
        return title_bangla;
    }

    public void setTitle_bangla(String title_bangla) {
        this.title_bangla = title_bangla;
    }

    public String getPlaced_company_bangla() {
        return placed_company_bangla;
    }

    public void setPlaced_company_bangla(String placed_company_bangla) {
        this.placed_company_bangla = placed_company_bangla;
    }

    public String getExperience_bangla() {
        return experience_bangla;
    }

    public void setExperience_bangla(String experience_bangla) {
        this.experience_bangla = experience_bangla;
    }

    public Long getAlumni_id() {
        return alumni_id;
    }

    public void setAlumni_id(Long alumni_id) {
        this.alumni_id = alumni_id;
    }

    public Long getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Long course_id) {
        this.course_id = course_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPlaced_company() {
        return placed_company;
    }

    public void setPlaced_company(String placed_company) {
        this.placed_company = placed_company;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }
}
