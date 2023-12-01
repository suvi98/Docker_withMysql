package com.hcl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.model.Book;
import com.hcl.serviceImpl.BookService;



@Controller
public class BooklistController {

	@Autowired
	BookService bookService;

	//Go on page for add the new book 
	@GetMapping("/addbook")
	public String addnewbook(ModelMap model) {

		//display all user list
		return "addbook";
	}


	//delete book details in book table by id
	@RequestMapping(value="/delete/book/{id}" , method=RequestMethod.GET)
	public String deleteBookDetails(@PathVariable long id,ModelMap modelmap) {

		bookService.deleteBookDetails(id);
		modelmap.addAttribute("listBook", bookService.getBookDetails()	);

		return "book";
	}

	//display the book list after the add new book
	@RequestMapping(value="/book" , method=RequestMethod.GET)
	public String getBookDetails(ModelMap modelmap){

		modelmap.addAttribute("listBook", 	 bookService.getBookDetails());

		return "book";
	}

	//add new book in book list
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String addbook(ModelMap model,Book book) {

		bookService.createBookDetails(book);

		model.addAttribute("listBook", bookService.getBookDetails());
		return "book";

	}

	//Go on page for put the details for updates by id
	@GetMapping("/update/book/{bookid}")
	public String updatenewbook(ModelMap model,@PathVariable long bookid) {

		model.addAttribute("bookid" ,bookid);
		model.addAttribute("listBook", bookService.getBookDetails());

		return "update";
	}


	//update the value by id and display list 
	@PostMapping("/update/book")
	public String updateBook(@RequestParam long bookid, @RequestParam(value = "bookname", required = true) String bookname,
			@RequestParam(value = "author", required = true) String author, @RequestParam("discription") String discription,
			ModelMap userModel) {

		Book book = new Book();


		book.setBookid(bookid);
		book.setBookname(bookname);
		book.setAuthor (author);
		book.setDiscription(discription);


		bookService.updateBookDetails(book);
		userModel.addAttribute("bookid", bookid);


		userModel.addAttribute("msg", "User with id : " + bookid + " updated successfully.");
		userModel.addAttribute("listBook", bookService.getBookDetails());
		return "book";

	}
}
