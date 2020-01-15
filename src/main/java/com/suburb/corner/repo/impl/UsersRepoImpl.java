package com.suburb.corner.repo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;

import com.suburb.coner.viewobj.UserVO;
import com.suburb.corner.dao.UsersDao;
import com.suburb.corner.repo.UsersRepo;

@ComponentScan
public class UsersRepoImpl implements UsersRepo {

	@Autowired
	private UsersDao usersDao;
	
	@Override
	public UserVO getUser(Integer id) {
		/*
		 * UserVO uservo = new UserVO(); UserBO userbo = usersDao.getUser(id); userbo.
		 */
		return null;
	}

	@Override
	public List<UserVO> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
