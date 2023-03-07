package com.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.model.Book;
import com.service.BookService;

@Controller
public class Bookcontroller {
	
	@Autowired
	BookService bookService;
	
	@RequestMapping("/")
	public ModelAndView home()
	{
		ModelAndView model = new ModelAndView();
		model.addObject("data",bookService.getallBook());
		model.addObject("book",new Book());
		model.setViewName("index");
		return model;
	}
	
	@RequestMapping(value = "/addBook",method =RequestMethod.POST )
	public String addBook(@Valid @ModelAttribute("book") Book b, BindingResult result)
	{
		//ModelAndView model = new ModelAndView();
		if(result.hasFieldErrors())
		{
			
			return "index";
		}
		else
		{
			bookService.addorUpdateBook(b);
			//model.setViewName("redirect:/");
			return "redirect:/";
		}
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
