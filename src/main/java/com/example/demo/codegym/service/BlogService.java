package com.example.demo.codegym.service;

import com.example.demo.codegym.model.Blog;
import com.example.demo.codegym.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BlogService implements IBlogService {
    @Autowired
    BlogRepository blogRepository;

    @Override
    public Iterable<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public Optional<Blog> findById(Long id) {
        return blogRepository.findById(id);
    }

    @Override
    public Iterable<Blog> show4newBlog() {
        return blogRepository.show4newBlog();
    }

    @Override
    public void save(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public Iterable<Blog> findAllByOrOrderByLikes() {
        return blogRepository.findAllByOrderByLikes();
    }

    @Override
    public Iterable<Blog> findAllByTitleContaining(String title) {
        return blogRepository.findAllByTitleContaining(title);
    }

    @Override
    public void remove(Long id) {
        blogRepository.deleteById(id);
    }
}
