package com.jsp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
