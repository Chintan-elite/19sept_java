package com.example.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;

@Controller
public class bookcontroller {
	
	@Autowired
	BookService bookService;
	
	@GetMapping("/")
	public ModelAndView index()
	{
		ModelAndView model = new ModelAndView();
		model.addObject("book", new Book());
		model.addObject("data",bookService.getallBook());
		model.setViewName("index");
		return model;
	
	}
	
	@RequestMapping(value = "/addBook",method =RequestMethod.POST )
	public String addBook(@ModelAttribute("book") Book b)
	{
		//ModelAndView model = new ModelAndView();
		
			bookService.addBook(b);
			//model.setViewName("redirect:/");
			return "redirect:/";
		
	}
		
	
	@RequestMapping("/delete")
	public ModelAndView delete(@RequestParam("did") int id)
	{
		ModelAndView model = new ModelAndView();
		bookService.deleteBook(id);
		model.setViewName("redirect:/");
		return model;
	}
	
	
	@RequestMapping("/edit")
	public ModelAndView edit(@RequestParam("did") int id)
	{
		ModelAndView model = new ModelAndView();
		model.addObject("data",bookService.getallBook());
		model.addObject("book",bookService.getBookById(id));
		model.setViewName("index");
		return model;
	}
	
	
}
