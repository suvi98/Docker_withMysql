package com.hcl.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.model.Book;
import com.hcl.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	BookRepository bookRepository;
	
	public List<Book> getBookDetails(){
		
		return bookRepository.findAll();
	}
	
	
	public Book createBookDetails(Book book) {
		
		return bookRepository.save(book);
	}
	
	public void deleteBookDetails(long id) {
		
		bookRepository.deleteById(id);
	}
	
	public Book updateBookDetails(Book book) {
		
		return bookRepository.save(book);
	}
}
