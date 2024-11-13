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
@Table(name = "notifications")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    User user;

    @ManyToOne
    @JoinColumn(name = "article_id", nullable = true)
    Article article;

    String message;

    @Column(name = "is_read", nullable = false)
    Boolean isRead = false;

    @Column(name = "created_at")
    LocalDateTime createdAt;
}
