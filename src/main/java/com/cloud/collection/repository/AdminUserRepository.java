package com.cloud.collection.repository;

import com.cloud.collection.models.user.AdminUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminUserRepository extends JpaRepository<AdminUser, Long> {
}
