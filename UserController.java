package com.medicine.controller;

import java.util.List;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;
import com.medicine.repository.*;
import com.medicine.entity.User;
import com.medicine.serviceimpl.UserServiceImpl;


@RestController
@RequestMapping("/onlineUserMedicine")
public class UserController
{
	@Autowired
	UserServiceImpl userServiceImpl;
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/userrecord")
	public List<User> getAllRecords()
	{
		return  userServiceImpl.getAllRecords();
	}

	@PostMapping("/addUserRecord") 
	public User addUser(@RequestBody User user) 
	{ 
	    return userServiceImpl.saveUserRecords(user) ;
	}
	
	@DeleteMapping("/userid/{userId}")
	public void deleteUserRecord(@PathVariable String userId)
	{
		Optional<?> checkuser=userRepository.findById(userId);
		if(checkuser.isPresent())
		{	
			this.userServiceImpl.deleteUserRecord(userId);
		}
		else
		{
			System.out.println("this login id is not present");
		}
	}
	
	@PutMapping("/user/{userId}")
	public User updateUser(@PathVariable String id,@RequestBody User user)
	{
		Optional<User> checkuser=userRepository.findById(id);
		if(checkuser.isPresent())
		{
			User users=new User();
			users.setUserId(user.getUserId());
			users.setPassword(user.getPassword());
			users.setName(user.getName());
			users.setAddress(user.getAddress());
			users.setContactNo(user.getContactNo());
			return userServiceImpl.updateUser(users);
			
		}
		else
		{
			System.out.println("this login id is not present");
			return null;
		}
		
	}
	
	@GetMapping("/getuser/{userId}")
	public User getUser( @PathVariable String id) 
	{
		Optional<User> checkuser=userRepository.findById(id);
		if(checkuser.isPresent())
		{
			return userServiceImpl.getUser(id);
			
		}
		else
		{
			System.out.println("this login id is not present");
			return null;
			
		}
		
	}
	
}
	
	
	
	
	
	
	
	
	
	
	

