package com.example.demo.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin("*")
@RequestMapping("/api/v1")
@RestController
public class UserController {
	
	@Autowired
	UserRepos userRepos;

	
	@RequestMapping("/user")
	public List<UserDet> findAll(){
		return userRepos.findAll();
	}
	

}
