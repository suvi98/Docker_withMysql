package com.hcl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;



//book Pojo

//lambok annotaion
@Data
@Entity

//create table in database
@Table(name="book")
public class Book {

	@Id
	
	//for declared as primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long bookid;
	
	//create the column in database by using @Column
	@Column(name="book_name")
	private String bookname;
	
	@Column(name="book_author")
	private String author;
	
	@Column(name="book_discription")
	private String discription;

	public long getBookid() {
		return bookid;
	}

	public void setBookid(long bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(long bookid, String bookname, String author, String discription) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.author = author;
		this.discription = discription;
	}
	
	
}
