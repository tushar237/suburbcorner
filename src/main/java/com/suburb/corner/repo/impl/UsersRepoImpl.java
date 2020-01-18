package com.suburb.corner.repo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suburb.coner.businessobj.UserData;
import com.suburb.coner.viewobj.UserVO;
import com.suburb.corner.dao.UsersDao;
import com.suburb.corner.repo.UsersRepo;

@Service("userRepo")
public class UsersRepoImpl implements UsersRepo {

	@Autowired
	private UsersDao userDao;

	@Override
	public UserVO getUser(Integer id) {

		UserVO uservo = new UserVO();

		UserData userbo = userDao.getUser(id);

		if (userbo != null) {
			uservo.setId(userbo.getData().getId());
			uservo.setEmail(userbo.getData().getEmail());
			uservo.setFirstName(userbo.getData().getFirstName());
			uservo.setLastName(userbo.getData().getLastName());
			uservo.setAvatar(userbo.getData().getAvatar());
		}

		return uservo;
	}

	@Override
	public List<UserVO> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
