package com.feedback.FeedbackForm.model;

import jakarta.persistence.*;

@Entity
@Table(name="Feedback Form")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name ="Content")
    private String content;
    @Column(name ="Date")
    private String date;

    public Post() {
    }

    public Post(int id, String date, String content) {
        this.id = id;
        this.date = date;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
