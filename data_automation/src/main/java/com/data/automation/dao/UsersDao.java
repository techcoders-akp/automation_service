package com.data.automation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.data.automation.entity.Users;
@Repository
public interface UsersDao extends JpaRepository<Users, Long>{

}
