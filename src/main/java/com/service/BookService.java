package com.service;

import java.util.List;

import com.dto.BookDTO;;

public interface BookService {

	void registerBk(BookDTO bookDTO);

	//BookDTO authenticate(String emailId, String password);

	List<BookDTO> findAllBooks();

	void deleteBk(int bookId);

	BookDTO fetchRecord(int bookId);

	void updateBook(BookDTO bookDTO);

	

}
