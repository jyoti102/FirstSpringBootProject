package com.basic.first.firstwebservices.dao.daoimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.basic.first.firstwebservices.dao.UserDao;
import com.basic.first.firstwebservices.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("INSERT INTO user (first_name, last_name, password, phone_no, email) VALUES (?,?,?,?,?)"
				,user.getFirstName(),user.getLastName(),user.getPassword(),988763466,user.getEmail());
	}

	@Override
	public List<Map<String, Object>> getUser() {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForList("Select * from user");
	}
}
