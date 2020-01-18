package com.suburb.corner.businessservice;

import java.util.List;

import com.suburb.coner.businessobj.UserData;
import com.suburb.coner.businessobj.UserBO;

public interface UserService {

	public List<UserBO> getUsers();

	public UserData getUser(Integer id);
}
