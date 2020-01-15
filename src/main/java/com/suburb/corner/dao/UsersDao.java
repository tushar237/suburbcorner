package com.suburb.corner.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.suburb.coner.businessobj.UserBO;

@Repository
public interface UsersDao {

	public List<UserBO> getUsers();
	public UserBO getUser(Integer id);
}
