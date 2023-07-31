package com.mukti.muktibackend.Entity;


import jakarta.persistence.*;

@Entity
@Table(name="gladiator")
public class Gladiator {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "gladiator_id", nullable = false)
    private Long gladiator_id;

    @Column(name="user_id")
    private Long user_id;

    @Column(name="course_id")
    private Long course_id;

    public Gladiator(){}

    public Gladiator(Long gladiator_id, Long user_id, Long course_id) {
        this.gladiator_id = gladiator_id;
        this.user_id = user_id;
        this.course_id = course_id;
    }

    public Long getGladiator_id() {
        return gladiator_id;
    }

    public void setGladiator_id(Long gladiator_id) {
        this.gladiator_id = gladiator_id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Long getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Long course_id) {
        this.course_id = course_id;
    }
}
