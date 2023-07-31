package com.mukti.muktibackend.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="evaluation")
public class Evaluation {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "eval_id", nullable = false)
    private Long eval_id;

    @Column(name = "course_id")
    private Long course_id;

    @Column(name="link")
    private String link;

    public Evaluation(){}

    public Evaluation(Long eval_id, Long course_id, String link) {
        this.eval_id = eval_id;
        this.course_id = course_id;
        this.link = link;
    }

    public Long getEval_id() {
        return eval_id;
    }

    public void setEval_id(Long eval_id) {
        this.eval_id = eval_id;
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
