package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    public List<Post> listAllPosts(){
        List<Post> list = new ArrayList<Post>();
        list.add(new Post("post1"));
        list.add(new Post("post2"));
        list.add(new Post("post3"));

        return list;
    }
}
