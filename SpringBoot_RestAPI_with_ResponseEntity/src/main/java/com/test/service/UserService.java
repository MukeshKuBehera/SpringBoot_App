package com.test.service;

import java.util.List;

import com.test.entity.User;

public interface UserService {

	public List<User> getUser();
	public void save(User user);
	public User findById(Integer id);
	public void delete(User user);
}
