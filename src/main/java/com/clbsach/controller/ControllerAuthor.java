package com.clbsach.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.clbsach.entity.Author;
import com.clbsach.service.AuthorService;

@Controller
@RequestMapping(value = "manages/author")
public class ControllerAuthor {

	@Autowired
	private AuthorService authorService;
	
	@RequestMapping(value = "/list")
	public String viewList(Model model) {
		model.addAttribute("listAuthor", authorService.getAll());
		return "manages/author_list";
	}
	
	@RequestMapping(value = "/create")
	public String viewCreate(Model model) {
		model.addAttribute("author", new Author());
		return "manages/author_form";
	}
	
	@RequestMapping(value = "/update/{authorId}")
	public String viewUpdate(@PathVariable("authorId") int authorId, Model model) {
		model.addAttribute("author", authorService.findById(authorId));
		return "manages/author_form";
	}
	
	@RequestMapping(value = "/save")
	public String viewSave(@ModelAttribute("author") Author author, Model model) {
		boolean bl = false;
		if(author.getAuthorId() == null)
			bl = authorService.save(author);
		else
			bl = authorService.update(author);
		if(bl)
			return "redirect:list";
		else
			return "manages/author_form";
	}
	
	@RequestMapping(value = "/delete/{authorId}")
	public String viewDelete(@PathVariable("authorId") int authorId, Model model) {
		Author author = authorService.findById(authorId);
		boolean bl = authorService.delete(author);
		if(bl)
			return "manages/author_list";
		else
			return "manages/author_list";
	}
}
