package com.inn.cafe.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inn.cafe.app.POJO.User;

public interface UserDao extends JpaRepository<User, Integer>{

}
