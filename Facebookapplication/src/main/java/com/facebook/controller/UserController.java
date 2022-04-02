package com.facebook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.facebook.entity.User;
import com.facebook.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {



	@Autowired
	private UserService userservice;

	@GetMapping("/findAllData")
	public List<User> findAll() {
		System.out.println("In findAll");
		return userservice.findAll();

	}

	@GetMapping("/{id}")
	public User findById(@PathVariable int id) {
		System.out.println("In Id");
		return userservice.findById(id);

	}

	@PostMapping("/save")
	public void save(@RequestBody User user) {
		System.out.println("In save");
		userservice.save(user);

	}

    @GetMapping("/delete/{id}")
    public void delete(@PathVariable int id) {
    	userservice.deleteViaId(id);
    	
    }
    @GetMapping("/update")
    public void update(User user) {
    	userservice.update(user);
    	
    	
    }
}
