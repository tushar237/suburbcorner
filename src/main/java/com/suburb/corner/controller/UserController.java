package com.suburb.corner.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.suburb.coner.viewobj.UserVO;
import com.suburb.corner.repo.UsersRepo;

@Controller
public class UserController {

	@Autowired
	private UsersRepo userRepo;
	
	@GetMapping("user/{id}")
	public UserVO getUser(@PathVariable("id") Integer id) {
		return userRepo.getUser(id);
	}
}
