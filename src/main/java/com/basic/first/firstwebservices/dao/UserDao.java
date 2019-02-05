package com.basic.first.firstwebservices.dao;

import java.util.List;
import java.util.Map;

import com.basic.first.firstwebservices.model.User;

public interface UserDao {

	int addUser(User user);

	List<Map<String, Object>> getUser();

}
