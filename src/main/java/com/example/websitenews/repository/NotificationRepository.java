package com.example.websitenews.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.websitenews.entity.Notification;

import java.util.List;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Integer> {
}
