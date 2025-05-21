package com.jsp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.Entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {
    Admin findByUsernameAndPassword(String username, String password);
}
