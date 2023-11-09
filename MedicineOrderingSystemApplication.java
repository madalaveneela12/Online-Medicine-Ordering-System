package com.medicine;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.medicine.entity.Admin;

import com.medicine.repository.AdminRepository;



@SpringBootApplication
public class MedicineOrderingSystemApplication  {

	public static void main(String[] args) {
		SpringApplication.run(MedicineOrderingSystemApplication.class, args);
		System.out.println("welcome to our medical store");
	}
	
	
    
	//private AdminRepository adminRepository;
	
	
    
    
      
	
	
	
	
}
