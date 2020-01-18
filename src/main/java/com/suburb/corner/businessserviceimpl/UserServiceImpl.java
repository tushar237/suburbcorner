package com.suburb.corner.businessserviceimpl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.suburb.coner.businessobj.UserData;
import com.suburb.coner.businessobj.UserBO;
import com.suburb.corner.businessservice.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Value("${url}")
	private String url;

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public UserData getUser(Integer id) {
		UserData user = null;
		try {
			HttpHeaders headers = getHttpHeaders();
			HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
			user = restTemplate.exchange(url + id, HttpMethod.GET, entity, UserData.class).getBody();
		} catch (HttpClientErrorException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public List<UserBO> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	public HttpHeaders getHttpHeaders() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.add("user-agent",
				"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
		return headers;
	}

}
