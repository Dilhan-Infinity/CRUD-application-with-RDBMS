package com.epictask1.fullstack.backend.repository;

import com.epictask1.fullstack.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
