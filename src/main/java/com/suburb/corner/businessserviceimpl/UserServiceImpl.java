package com.suburb.corner.businessserviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.suburb.coner.businessobj.UserBO;
import com.suburb.corner.businessservice.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Value("${url}")
	private static String USERSERVICEURL;

	private RestTemplate restTemplate;

	@Override
	public UserBO getUser(Integer id) {
		return restTemplate.getForEntity(USERSERVICEURL + id, UserBO.class).getBody();
	}

	@Override
	public List<UserBO> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}
}
