package com.dto;

public class BookDTO {
	int bookId;
	String name;
	int price;
	public BookDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "BookDTO [bookId=" + bookId + ", name=" + name + ", price=" + price + "]";
	}
	public BookDTO(int bookId, String name, int price) {
		super();
		this.bookId = bookId;
		this.name = name;
		this.price = price;
	}
	
	
}
