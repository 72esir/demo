package com.example.demo.model;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.io.Serializable;

@Entity
public class Post implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String text;
    private Integer likes = 0;
    private Date creationDate;

    public Post(){}

    public Post (final Long id, final String text, final Date date){
        this.text = text;
        this.id = id;
    }

    public String getText(){
        return text;
    }
    public Integer getLikes(){
        return likes;
    }
    public Date getCreationDate(){
        return creationDate;
    }
    public void setLikes(int likes){
        this.likes = likes;
    }
    public long getId(){
        return id;
    }
}
