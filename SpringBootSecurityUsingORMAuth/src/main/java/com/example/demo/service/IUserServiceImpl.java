package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repo.UserRepository;
@Service
public class IUserServiceImpl implements IUserService {
   @Autowired
	private UserRepository repo;
	@Override
	public Integer saveUser(User user) {
		user = repo.save(user);
		return user.getUid();
	}

}
