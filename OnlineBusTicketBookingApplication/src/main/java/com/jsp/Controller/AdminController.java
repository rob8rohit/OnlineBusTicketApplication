package com.jsp.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.Entity.Admin;
import com.jsp.Repository.AdminRepository;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

	private final AdminRepository adminRepository;

    public AdminController(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    @PostMapping("/login")
    public String login(@RequestBody Admin loginData) {
        Admin admin = adminRepository.findByUsernameAndPassword(
                loginData.getUsername(), loginData.getPassword()
        );
        return admin != null ? "success" : "fail";
    }
}
