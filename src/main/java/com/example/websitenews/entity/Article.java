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
@Table(name = "articles")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(nullable = false)
    String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    String content;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    Category category;

    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false)
    User author;

    @Column(name = "created_at")
    LocalDateTime createdAt;

    @Column(name = "updated_at")
    LocalDateTime updatedAt;

    // Constructors, Getters, and Setters
}
