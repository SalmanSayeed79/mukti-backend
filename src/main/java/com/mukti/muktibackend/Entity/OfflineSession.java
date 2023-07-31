package com.mukti.muktibackend.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="offline_session")
public class OfflineSession {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "offline_id", nullable = false)
    private Long offline_id;

    @Column(name = "course_id")
    private Long course_id;

    @Column(name="link")
    private String link;

    public OfflineSession(){}

    public OfflineSession(Long offline_id, Long course_id, String link) {
        this.offline_id = offline_id;
        this.course_id = course_id;
        this.link = link;
    }

    public Long getOffline_id() {
        return offline_id;
    }

    public void setOffline_id(Long offline_id) {
        this.offline_id = offline_id;
    }

    public Long getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Long course_id) {
        this.course_id = course_id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
