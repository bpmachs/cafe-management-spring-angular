package com.inn.cafe.app.restImpl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.inn.cafe.app.rest.UserRest;
import com.inn.cafe.app.service.UserService;

@RestController
public class UserRestImpl implements UserRest{
	
	@Autowired
	UserService userService;
	@Override
	public ResponseEntity<String> signUp(Map<String, String> requestMap) {
		// TODO Auto-generated method stub
		try {
			return userService.signUp(requestMap);
		} catch(Exception ec) {
			ec.printStackTrace();
		}
		
		return new ResponseEntity<String>("", HttpStatus.OK);
		
	}

}
