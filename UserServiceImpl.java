package com.medicine.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicine.entity.User;
import com.medicine.repository.UserRepository;
import com.medicine.service.UserService;


@Service
public class UserServiceImpl implements UserService
{
	@Autowired
	UserRepository userRepository;
	
	UserServiceImpl()
	{
		
	}

	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public List<User> getAllRecords() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}
	
	@Override
	public User saveUserRecords(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
		
	}

	@Override
	public void deleteUserRecord(String userId) {
		// TODO Auto-generated method stub
		userRepository.deleteById(userId);
		
	}
	
	

	@Override
	public User updateUser(User users) {
		// TODO Auto-generated method stub
		return userRepository.save(users);
	}

	@Override
	public User getUser(String id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).get();
	}
	
	
	

}
