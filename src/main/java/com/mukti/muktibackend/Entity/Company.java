package com.mukti.muktibackend.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "company_id", nullable = false)
    private Long company_id;

    @Column(name="name")
    private String name;
    @Column(name="subtitle")
    private String subtitle;

    @Column(name="location")
    private String location;

    @Column(name="name_bangla")
    private String name_bangla;
    @Column(name="subtitle_bangla")
    private String subtitle_bangla;

    @Column(name="location_bangla")
    private String location_bangla;

    @Column(name="employee_count")
    private Long employee_count;

    @Column(name="image")
    private String image;

    public Company(){}

    public Company(Long company_id, String name, String subtitle, String location, String name_bangla, String subtitle_bangla, String location_bangla, Long employee_count, String image) {
        this.company_id = company_id;
        this.name = name;
        this.subtitle = subtitle;
        this.location = location;
        this.name_bangla = name_bangla;
        this.subtitle_bangla = subtitle_bangla;
        this.location_bangla = location_bangla;
        this.employee_count = employee_count;
        this.image = image;
    }

    public Long getCompany_id() {
        return company_id;
    }

    public void setCompany_id(Long company_id) {
        this.company_id = company_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName_bangla() {
        return name_bangla;
    }

    public void setName_bangla(String name_bangla) {
        this.name_bangla = name_bangla;
    }

    public String getSubtitle_bangla() {
        return subtitle_bangla;
    }

    public void setSubtitle_bangla(String subtitle_bangla) {
        this.subtitle_bangla = subtitle_bangla;
    }

    public String getLocation_bangla() {
        return location_bangla;
    }

    public void setLocation_bangla(String location_bangla) {
        this.location_bangla = location_bangla;
    }

    public Long getEmployee_count() {
        return employee_count;
    }

    public void setEmployee_count(Long employee_count) {
        this.employee_count = employee_count;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
