package com.example.demo.codegym.repository;


import com.example.demo.codegym.model.Blog;
//import org.springframework.data.jdbc.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends JpaRepository<Blog,Long> {
    Iterable<Blog> findAllByTitleContaining(String title);
    Iterable<Blog> findAllByOrderByLikes();
   @Query(value = "select * from blog order by id desc LIMIT 4",nativeQuery = true)
    Iterable<Blog> show4newBlog();
}
