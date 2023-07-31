package com.mukti.muktibackend.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="experience")
public class Experience {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "exp_id", nullable = false)
    private Long exp_id;

    @Column(name="user_id")
    private Long user_id;

    @Column(name="company")
    private String company;

    @Column(name="title")
    private String title;

    @Column(name="duration")
    private String duration;

    @Column(name="company_bangla")
    private String company_bangla;

    @Column(name="title_bangla")
    private String title_bangla;

    @Column(name="duration_bangla")
    private String duration_bangla;

    public Experience(){}


    public Experience(Long exp_id, Long user_id, String company, String title, String duration, String company_bangla, String title_bangla, String duration_bangla) {
        this.exp_id = exp_id;
        this.user_id = user_id;
        this.company = company;
        this.title = title;
        this.duration = duration;
        this.company_bangla = company_bangla;
        this.title_bangla = title_bangla;
        this.duration_bangla = duration_bangla;
    }

    public String getCompany_bangla() {
        return company_bangla;
    }

    public void setCompany_bangla(String company_bangla) {
        this.company_bangla = company_bangla;
    }

    public String getTitle_bangla() {
        return title_bangla;
    }

    public void setTitle_bangla(String title_bangla) {
        this.title_bangla = title_bangla;
    }

    public String getDuration_bangla() {
        return duration_bangla;
    }

    public void setDuration_bangla(String duration_bangla) {
        this.duration_bangla = duration_bangla;
    }

    public Long getExp_id() {
        return exp_id;
    }

    public void setExp_id(Long exp_id) {
        this.exp_id = exp_id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
