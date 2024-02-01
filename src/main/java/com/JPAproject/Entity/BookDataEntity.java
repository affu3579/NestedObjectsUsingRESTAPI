package com.JPAproject.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

import jakarta.persistence.Table;

@Entity
@Table(name="BookData")
public class BookDataEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="SNO")
	private int sNo;
	@Column(name="BookName")
	private String bookName;
	
	@OneToOne(cascade = CascadeType.ALL)
    private Author author;
	
	public BookDataEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookDataEntity(int sNo, String bookName, Author author) {
		super();
		this.sNo = sNo;
		this.bookName = bookName;
		this.author = author;
	}
	public int getsNo() {
		return sNo;
	}
	public void setsNo(int sNo) {
		this.sNo = sNo;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	} 

}
