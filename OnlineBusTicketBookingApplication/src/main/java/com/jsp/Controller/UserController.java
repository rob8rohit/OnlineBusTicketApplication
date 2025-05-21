package com.jsp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.Entity.User;
import com.jsp.Repository.UserRepository;

@RestController
@RequestMapping("/api/users")
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	 @PostMapping("/register")
	    public User registerUser(@RequestBody User user) {
	        return userRepository.save(user);
	    }

	    @PostMapping("/login")
	    public boolean loginUser(@RequestBody User user) {
	        User existingUser = userRepository.findByEmail(user.getEmail());
	        return existingUser != null && existingUser.getPassword().equals(user.getPassword());
	    }

}
