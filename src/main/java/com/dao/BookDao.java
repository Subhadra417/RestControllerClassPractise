package com.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.BookEntity;

@Repository
public interface BookDao extends JpaRepository<BookEntity,Integer>{

	
	
	//Optional<BookEntity> findByEmailIdAndPassword(String emailId, String password);  

	   // List<BookEntity> findAll();
	
	
	
}
