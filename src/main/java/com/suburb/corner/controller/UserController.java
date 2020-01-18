package com.suburb.corner.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.suburb.coner.viewobj.UserVO;
import com.suburb.corner.repo.UsersRepo;

@RestController
public class UserController {

	@Autowired
	private UsersRepo userRepo;

	@GetMapping(path = "user/{id}")
	public UserVO getUser(@PathVariable("id") Integer id) {
		UserVO user = userRepo.getUser(id);
		return user;
	}
}
