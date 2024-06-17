package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity // table
@Table(name = "stu_tbl") //
public class BookEntity {
	@Id
	@GeneratedValue
	private int bookId; // pk +auto generated @Column(name="empId")
	private String Name;
	private int price;

	public BookEntity() {
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
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public BookEntity(int bookId, String name, int price) {
		super();
		this.bookId = bookId;
		Name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "BookEntity [bookId=" + bookId + ", Name=" + Name + ", price=" + price + "]";
	}

}
