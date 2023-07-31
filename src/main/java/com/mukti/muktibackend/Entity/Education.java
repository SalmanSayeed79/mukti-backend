package com.mukti.muktibackend.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="education")
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "edu_id", nullable = false)
    private Long edu_id;

    @Column(name="user_id")
    private Long user_id;

    @Column(name="name")
    private String name;

    @Column(name="name_bangla")
    private String name_bangla;

    @Column(name="grade")
    private Double grade;

    @Column(name="passing_year")
    private String passing_year;

    @Column(name="passing_year_bangla")
    private String passing_year_bangla;

    public Education(){}

    public Education(Long edu_id, Long user_id, String name, String name_bangla, Double grade, String passing_year, String passing_year_bangla) {
        this.edu_id = edu_id;
        this.user_id = user_id;
        this.name = name;
        this.name_bangla = name_bangla;
        this.grade = grade;
        this.passing_year = passing_year;
        this.passing_year_bangla = passing_year_bangla;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Long getEdu_id() {
        return edu_id;
    }

    public void setEdu_id(Long edu_id) {
        this.edu_id = edu_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName_bangla() {
        return name_bangla;
    }

    public void setName_bangla(String name_bangla) {
        this.name_bangla = name_bangla;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    public String getPassing_year() {
        return passing_year;
    }

    public void setPassing_year(String passing_year) {
        this.passing_year = passing_year;
    }

    public String getPassing_year_bangla() {
        return passing_year_bangla;
    }

    public void setPassing_year_bangla(String passing_year_bangla) {
        this.passing_year_bangla = passing_year_bangla;
    }
}
