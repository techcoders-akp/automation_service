package com.data.automation.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.data.automation.dao.UsersDao;
import com.data.automation.entity.Users;
@Component
public class DataAutomationManager {
	
	@Autowired
	UsersDao usersDao;
	
	public List<Users> getUsers() {
		return usersDao.findAll();
	}
}
