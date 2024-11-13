package com.example.websitenews.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.websitenews.entity.ArticleView;

@Repository
public interface ArticleViewRepository extends JpaRepository<ArticleView, Integer> {
}
