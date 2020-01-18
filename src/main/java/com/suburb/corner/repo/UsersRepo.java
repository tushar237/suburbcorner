package com.suburb.corner.repo;

import java.util.List;

import com.suburb.coner.viewobj.UserVO;

public interface UsersRepo {

	public List<UserVO> getUsers();

	public UserVO getUser(Integer id);
}
