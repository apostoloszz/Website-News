package com.example.websitenews.entity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Entity
@Table(name = "likes_dislikes")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class LikeDislike {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @ManyToOne
    @JoinColumn(name = "article_id", nullable = false)
    Article article;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    User user;

    @Column(name = "is_like", nullable = false)
    Boolean isLike; // true for like, false for dislike

    @Column(name = "created_at")
    LocalDateTime createdAt;
}
