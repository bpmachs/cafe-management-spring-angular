package com.inn.cafe.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.inn.cafe.app.POJO.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer>{
	User findByEmail(@Param("email") String email);
}
