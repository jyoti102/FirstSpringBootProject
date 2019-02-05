package com.basic.first.firstwebservices.service;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.ResponseBody;

import com.basic.first.firstwebservices.model.User;
import com.basic.first.firstwebservices.utils.Response;

public interface UserService {

	Response addUser(User user);

	List<Map<String, Object>> getUsers();

}
