package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.PostRepository;

@Service
public class LikesService {
    @Autowired
    private PostRepository postRepository;

    public int like(Long postId){
        final Post post = postRepository.findById(postId).get();
        post.setLikes(post.getLikes() + 1);
        postRepository.save(post);
        return post.getLikes();
    }
}
