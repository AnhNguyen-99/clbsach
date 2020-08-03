package com.clbsach.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.clbsach.entity.News;
import com.clbsach.service.NewsService;

@Controller
@RequestMapping(value = "manages/news")
public class ControllerNews {

	@Autowired
	private NewsService newsService;
	
	@RequestMapping(value = "/list")
	public String viewList(Model model) {
		model.addAttribute("listNews", newsService.getAll());
		return "manages/news_list";
	}
	
	@RequestMapping(value = "/create")
	public String viewCreate(Model model) {
		model.addAttribute("news", new News());
		return "manages/news_form";
	}
	
	@RequestMapping(value = "update/{newsId}")
	public String viewUpdate(@PathVariable("newsId") int newsId, Model model) {
		model.addAttribute("news", newsService.findById(newsId));
		return "manages/news_form";
	}
	
	@RequestMapping(value  = "/save")
	public String viewSave(@ModelAttribute("news") News news,  Model model) {
		return "";
	}
	
	@RequestMapping(value = "/delete/{newsId}")
	public String viewDelete(@PathVariable("newsId") int newsId, Model model) {
		News news = newsService.findById(newsId);
		boolean bl = newsService.delete(news);
		if(bl)
			return "manages/news_list";
		else
			return "manages/news_list";
	}
}
