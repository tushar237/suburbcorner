package com.suburb.corner.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.suburb.coner.businessobj.UserBO;
import com.suburb.corner.businessservice.UserService;
import com.suburb.corner.dao.UsersDao;

public class UsersDaoImpl implements UsersDao {

	@Autowired
	private UserService userService;
	
	@Override
	public UserBO getUser(Integer id) {
		return userService.getUser(id);
	}
	
	@Override
	public List<UserBO> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
