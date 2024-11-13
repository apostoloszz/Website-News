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
@Table(name = "article_views")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ArticleView {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @OneToOne
    @JoinColumn(name = "article_id", nullable = false)
    Article article;

    @Column(name = "view_count", nullable = false)
    int viewCount = 0;

    @Column(name = "last_viewed")
    LocalDateTime lastViewed;
}

