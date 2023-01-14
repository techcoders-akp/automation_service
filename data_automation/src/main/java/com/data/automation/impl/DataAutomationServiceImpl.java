package com.data.automation.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.automation.entity.Users;
import com.data.automation.manager.DataAutomationManager;
import com.data.automation.service.DataAutomationService;


@Service
public class DataAutomationServiceImpl implements DataAutomationService {
	
	@Autowired
	DataAutomationManager dataAutomationManager;

	@Override
	public List<Users> getUsers() {		
		return dataAutomationManager.getUsers();
	}

}
