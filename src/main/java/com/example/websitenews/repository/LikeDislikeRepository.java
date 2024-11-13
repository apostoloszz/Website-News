package com.example.websitenews.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.websitenews.entity.LikeDislike;

import java.util.Optional;

@Repository
public interface LikeDislikeRepository extends JpaRepository<LikeDislike, Integer> {
}
