package com.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.BookDao;

import com.dto.BookDTO;

import com.entity.BookEntity;


@Service
@Transactional
public class BookServiceImpl implements BookService{

	@Autowired
	BookDao BookDao;


	public void registerBk1(BookDTO bookDTO) {
		
		BookEntity bookEntity=new BookEntity();
		
		//copy bookDTO to bookEntity
		BeanUtils.copyProperties(bookDTO, bookEntity);
		BookDao.save(bookEntity); //bookEntity object will be saved in table as a record
		
	}


	/*public BookDTO authenticate1(String emailId, String password) {
		Optional<BookEntity> optional=BookDao.findByEmailIdAndPassword(emailId,password);
			                             
		BookDTO  bookDTO=null;
		
		if(optional.isPresent()) {
			//valid
			BookEntity bookEntity=optional.get();
			
			bookDTO=new BookDTO();
			BeanUtils.copyProperties(bookEntity, bookDTO);
			
			return bookDTO;   //not null
		} else {
			//for false condition (if record not found)
			return bookDTO;  //null
		}
	}/*/


	@Override
	public List<BookDTO> findAllBooks() {
		List<BookEntity> bookEntity=BookDao.findAll();
		
		List<BookDTO>  bookDtoList=new ArrayList<>();     //blank arrayList
		
		//if(employeeEntity.isEmpty()) {
			//Returns true if this list contains no elements.<----isEmpty()
			if(bookEntity.size()>0) {
			           for(BookEntity   tempa:bookEntity) {
			        	                    //1st          //3
			        	   BookDTO bookDTO=new BookDTO();
			        	   
			        	   BeanUtils.copyProperties(tempa,bookDTO );
			        	                             //1st    //copied in employeeDTO
			        	                      //2nd   //3rd
			        	   
			        	   bookDtoList.add(bookDTO); //in first iteration, first object has been added in blank arrayList
			           }
			      }
		
		return bookDtoList; //employeeDtoList<---it is collection of records in the form of objects
	}

   //delete operation
	@Override
	public void deleteBk(int bookId) {
		BookDao.deleteById(bookId);   //5
		
	}

     //fetch the data on edit form (updateEmployee)
	public BookDTO fetchRecord1(int bookId) {
		Optional<BookEntity> optional=BookDao.findById(bookId);
		BookDTO bookDTO=null;
		
		if(optional.isPresent()) {
			BookEntity bookEntity=optional.get();
			bookDTO=new BookDTO();
			
			BeanUtils.copyProperties(bookEntity, bookDTO);
			
			return bookDTO;
		}else {
			
			return bookDTO;
		}
	}


	//edit operation- tier-II (updated data are being saved in table)
	public void updateBook1(BookDTO bookDTO) {
		
		BookEntity bookEntity=new BookEntity();
		
		BeanUtils.copyProperties(bookDTO,bookEntity);
		BookDao.save(bookEntity); //2 MrDurga  10000  dg@gmail.com  222
		
	}


	@Override
	public void registerBk(BookDTO bookDTO) {
		// TODO Auto-generated method stub
		
	}


	


	@Override
	public BookDTO fetchRecord(int bookId) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void updateBook(BookDTO bookDTO) {
		// TODO Auto-generated method stub
		
	}
	
	
}
