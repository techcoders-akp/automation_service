package com.data.automation.service;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.data.automation.entity.Users;

@RestController
public interface DataAutomationService {
	
	@GetMapping("/users")
	public List<Users> getUsers();
}
