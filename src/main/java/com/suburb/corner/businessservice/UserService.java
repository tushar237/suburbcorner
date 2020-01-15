package com.suburb.corner.businessservice;

import java.util.List;

import com.suburb.coner.businessobj.UserBO;

public interface UserService {

	public List<UserBO> getUsers();
	public UserBO getUser(Integer id);
}
