package com.javne.restapi.service;


import com.javne.restapi.model.Comment;
import com.javne.restapi.model.Post;
import com.javne.restapi.repository.CommentRepository;
import com.javne.restapi.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PostService {

    public static final int PAGE_SIZE = 20;
    private final PostRepository postRepository;
    private final CommentRepository commentRepository;

    public List<Post> getPosts(int page, Sort.Direction sort) {
        return postRepository.findAllPosts
                (PageRequest.of(page,PAGE_SIZE, Sort.by(sort, "id")));
    }

    public Post getSinglePost(long id) {
        return postRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                "Post not found"));
    }

    public List<Post> getPostsWithComments(int page, Sort.Direction sort) {
        List<Post> allPosts = postRepository
                .findAllPosts(PageRequest.of(page, PAGE_SIZE, Sort.by(sort, "id")));
        List<Long> ids = allPosts.stream()
                .map(post -> post.getId())
                .collect(Collectors.toList());
        List<Comment> comments = commentRepository.findAllByPostIdIn(ids);
        allPosts.forEach(post -> post.setComment(extractComments(comments,post.getId())));
        return allPosts;
    }

    private List<Comment> extractComments(List<Comment> comments, long id) {
        return comments.stream()
                .filter(comment -> comment.getPostId()== id)
                .collect(Collectors.toList());
    }

    public Post addPost(Post post) {
        return postRepository.save(post);
    }
}


