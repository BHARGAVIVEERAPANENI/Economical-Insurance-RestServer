package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.AppDao;
import com.demo.model.User;

@Service
public class AppService {
	@Autowired
	AppDao appDao;

	public User getUserInfo(int userId, String email) {
		// TODO Auto-generated method stub
		return appDao.getUserInfo(userId, email);
	}

}
