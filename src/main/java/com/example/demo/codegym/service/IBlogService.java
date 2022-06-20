package com.example.demo.codegym.service;


import com.example.demo.codegym.model.Blog;
import org.springframework.stereotype.Service;

@Service
public interface IBlogService extends IGeneralService<Blog> {
    Iterable<Blog> findAllByTitleContaining(String title);
    Iterable<Blog> findAllByOrOrderByLikes();
    Iterable<Blog> show4newBlog();

}
