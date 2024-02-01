package com.JPAproject.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JPAproject.Entity.BookDataEntity;
import com.JPAproject.Repo.BookDataRepo;
@Service
public class BookDataService {
     @Autowired
	public BookDataRepo bookDataRepo;
	public BookDataEntity addBooks(BookDataEntity entity) {
		// TODO Auto-generated method stub
		return this.bookDataRepo.save(entity);
	}
	public List<BookDataEntity> getBooks() {
		// TODO Auto-generated method stub
	List<BookDataEntity> book=	this.bookDataRepo.findAll();
		return book;
	}
	public Optional<BookDataEntity>  getBookByID(int id) {
		// TODO Auto-generated method stub
		if(bookDataRepo.existsById(id)) {
			return this.bookDataRepo.findById(id);
		}
     return Optional.empty();
	}
	

}
