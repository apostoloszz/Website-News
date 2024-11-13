package com.example.websitenews.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "comments")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @ManyToOne
    @JoinColumn(name = "article_id", nullable = false)
    Article article;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    User user;

    @Column(columnDefinition = "TEXT", nullable = false)
    String content;

    @Column(name = "created_at")
    LocalDateTime createdAt;
}
