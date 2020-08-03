package com.clbsach.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.clbsach.entity.Category;
import com.clbsach.service.CategoryService;

@Controller
@RequestMapping(value = "manages/category")
public class ControllerCategory {

	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping(value = "/list")
	public String viewList(Model model) {
		model.addAttribute("listCategory", categoryService.getAll());
		return "manages/category_list";
	}
	
	@RequestMapping(value = "/create")
	public String viewCreate(Model model) {
		model.addAttribute("category", new Category());
		return "manages/category_form";
	}
	
	@RequestMapping(value = "/update/{categoryId}")
	public String viewUpdate(@PathVariable("categoryId") int categoryId, Model model) {
		model.addAttribute("category", categoryService.findById(categoryId));
		return "manages/category_form";
	}
	
	@RequestMapping(value = "/save")
	public String viewSave(@ModelAttribute("category") Category category, Model model) {
		boolean bl = false;
		if(category.getCategoryId() == null) 
			bl = categoryService.save(category);
		else
			bl = categoryService.update(category);
		if(bl)
			return "manages/category_list";
		else
			return "manages/category_form";
	}
	
	@RequestMapping(value = "/delete/{categoryId}")
	public String viewDelete(@PathVariable("categoryId") int categoryId) {
		Category category = categoryService.findById(categoryId);
		boolean bl = categoryService.delete(category);
		if(bl)
			return "manages/category_form";
		else
			return "manages/category_form";
	}
	
}
