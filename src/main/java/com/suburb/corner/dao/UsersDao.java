package com.suburb.corner.dao;

import java.util.List;

import com.suburb.coner.businessobj.UserData;
import com.suburb.coner.businessobj.UserBO;

public interface UsersDao {

	public List<UserBO> getUsers();

	public UserData getUser(Integer id);
}
