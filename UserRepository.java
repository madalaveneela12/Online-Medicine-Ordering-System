package com.medicine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medicine.entity.User;

public interface UserRepository extends JpaRepository<User,String>
{
	

}
