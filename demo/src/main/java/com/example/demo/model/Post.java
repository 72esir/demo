package com.example.demo.model;

import java.util.Date;

public class Post {
    private String text;
    private Integer likes = 0;
    private Date creationDate;
    private Long id;

    public Post (Long id, String text, Date creationDate){
        this.text = text;
        this.creationDate = creationDate;
        this.id = id;
    }

    public Post (String text, Date creationDate){

    }
    public Post (String text){
        this.text = text;
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
