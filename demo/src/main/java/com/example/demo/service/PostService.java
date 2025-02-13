package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;
import com.example.demo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.Date;
import java.util.List;
import java.util.stream.StreamSupport;


@Service
public class PostService {
    @Autowired
    PostRepository postRepository;

    public List<Post> listAllPosts(){
        /*posts.add(new Post("post1"));
        posts.add(new Post("post2"));
        posts.add(new Post("post3"));*/
        return StreamSupport.stream(postRepository.findAll().spliterator(), false).toList();
    }
    public void create(String text) {
        Post post = new Post(null, text, new Date());
        postRepository.save(post);
    }
}
