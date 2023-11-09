package com.medicine.service;

import java.util.List;


import com.medicine.entity.User;

public interface UserService 
{
	List<User> getAllRecords();
	User saveUserRecords(User user);
	void deleteUserRecord(String userId);
	User updateUser(User users);
	User getUser(String id);

}
