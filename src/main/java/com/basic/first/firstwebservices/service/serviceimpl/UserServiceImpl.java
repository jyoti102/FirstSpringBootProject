package com.basic.first.firstwebservices.service.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import com.basic.first.firstwebservices.dao.UserDao;
import com.basic.first.firstwebservices.model.User;
import com.basic.first.firstwebservices.service.UserService;
import com.basic.first.firstwebservices.utils.Response;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public Response addUser(User user) {
		// TODO Auto-generated method stub
		int key=userDao.addUser(user);
		if(key>0) {
			return new Response("200", "Success");
		}
		return new Response("201", "Failure");
	}

	@Override
	public List<Map<String, Object>> getUsers() {
		// TODO Auto-generated method stub
		return userDao.getUser();
	}

}
