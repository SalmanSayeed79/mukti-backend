package com.mukti.muktibackend.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="gladiator_added_user")
public class GladiatorAddedUser {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "gau_id", nullable = false)
    private Long gau_id;

    @Column(name="gladiator_id")
    private Long gladiator_id;

    @Column(name="user_id")
    private Long user_id;

    public GladiatorAddedUser(){}

    public GladiatorAddedUser(Long gau_id, Long gladiator_id, Long user_id) {
        this.gau_id = gau_id;
        this.gladiator_id = gladiator_id;
        this.user_id = user_id;
    }

    public Long getGau_id() {
        return gau_id;
    }

    public void setGau_id(Long gau_id) {
        this.gau_id = gau_id;
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
}
