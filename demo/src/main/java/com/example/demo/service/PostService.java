package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Service
public class PostService {
    public List<Post> posts = new ArrayList<>();

    public List<Post> listAllPosts(){
        /*posts.add(new Post("post1"));
        posts.add(new Post("post2"));
        posts.add(new Post("post3"));*/
        posts.add(new Post((long)posts.size(), "post1", new Date()));
        return posts;
    }
    public void create(String text) {
        posts.add(new Post((long)posts.size(), text, new Date()));
    }
}
