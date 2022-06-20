package com.example.demo.codegym.controller;

import com.example.demo.codegym.model.Blog;
import com.example.demo.codegym.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@CrossOrigin("*")
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    IBlogService blogService;

    @GetMapping
    public ResponseEntity<Iterable<Blog>> findAllBlog() {
        return new ResponseEntity<>(blogService.findAll(), HttpStatus.OK);
    }
    @GetMapping("/find-by-title")
    public ResponseEntity<Iterable<Blog>> findByName(@RequestParam String name){
        return new ResponseEntity<>(blogService.findAllByTitleContaining(name),HttpStatus.OK);
    }

    @GetMapping("/oder-by-like")
    public ResponseEntity<Iterable<Blog>> oderByLike(){
        return new ResponseEntity<>(blogService.findAllByOrOrderByLikes(),HttpStatus.OK);
    }
    @GetMapping("/show4blog")
    public ResponseEntity<Iterable<Blog>> show4Blog(){
        return new ResponseEntity<>(blogService.show4newBlog(),HttpStatus.OK);
    }
}


