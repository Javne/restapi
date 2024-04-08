package com.javne.restapi.controller;

import com.javne.restapi.model.Post;
import com.javne.restapi.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PostController {


    private final PostService postService;

    @GetMapping("/posts")
    public List<Post> getPosts() {
        return postService.getPosts();
    }


    @GetMapping("/posts/{id}")
    public Post getSinglePost(@PathVariable("id") long id) {
        return postService.getSinglePost(id);
    }

}
