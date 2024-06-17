package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dto.BookDTO;
import com.service.BookService;

@RestController
@RequestMapping("/version2")
public class BookRestController2 {
	
	@Autowired
	BookService bookService;
	
	
	//fetch all records
		@GetMapping("/books")  ////localhost:666/version2/employees
		public ResponseEntity<List<BookDTO>> fetchAllRecords() {
			
		List<BookDTO>	bookDtoList=bookService.findAllBooks();			
		   
			return new ResponseEntity<>(bookDtoList,HttpStatus.OK);
		}
		
		
		//fetch a particular record on basis of id
				@GetMapping("/books/{bookId}") //localhost:666/version2/employees/2
				public ResponseEntity<BookDTO> fetchRecordOfBook(@PathVariable int bookId) {
				BookDTO	bookDto=bookService.fetchRecord(bookId)	;  
				
				return new ResponseEntity<>(bookDto,HttpStatus.OK);
				   
					
				}
				
				
				//localhost:666/employees
				
				//registering a user
				@PostMapping("/books")
				public ResponseEntity<String> registerBook(@RequestBody BookDTO bookDTO) {
					
					        
					bookService.registerBk(bookDTO);
					
					return new ResponseEntity<>("registered successfully",HttpStatus.CREATED);
					
					
					
				}
				
				
				@PutMapping("/books")
				public String updateBook(@RequestBody BookDTO bookDTO) {
					
					        
					bookService.registerBk(bookDTO);//here it will work as update because we are providind employeeID
					
					
					return "updatede successfully";
				}
				
				
				@DeleteMapping("/books/{bookId}") //localhost:666/employees/2
				public String deleteRecordOfBook(@PathVariable int bookId) {
				bookService.deleteBk(bookId);  
				   
					return "deleted successfully";
				}
				
				
				
					
		
}