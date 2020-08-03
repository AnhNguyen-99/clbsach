package com.clbsach.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.clbsach.entity.Publishing;
import com.clbsach.service.PublishingService;

@Controller
@RequestMapping(value = "manages/publishing")
public class ControllerPublishing {
	
	@Autowired
	private PublishingService publishingService;
	
	@RequestMapping(value = "/list")
	public String viewList(Model model) {
		model.addAttribute("listPublishing", publishingService.getAll());
		return "manages/publishing_list";
	}
	
	@RequestMapping(value = "/create")
	public String viewCreate(Model model) {
		model.addAttribute("publishing", new Publishing());
		return "manages/publishing_form";
	}
	
	@RequestMapping(value = "/update/{publishingId}")
	public String viewUpdate(@PathVariable("publishingId") int publishingId, Model model) {
		model.addAttribute("publishing", publishingService.findById(publishingId));
		return "manages/publishing_form";
	}
	
	@RequestMapping(value = "/save")
	public String viewSave(@ModelAttribute("publishing") Publishing publishing, Model model) {
		boolean bl = false;
		if(publishing.getPublishingId() == null)
			bl = publishingService.save(publishing);
		else
			bl = publishingService.update(publishing);
		if(bl)
			return "redirect:list";
		else
			return "manages/publishing_form";
	}
	
	@RequestMapping(value = "/delete/{publishingId}")
	public String viewDelete(@PathVariable("publishingId") int publishingId, Model model) {
		Publishing publishing = publishingService.findById(publishingId);
		boolean bl = publishingService.delete(publishing);
		if(bl)
			return "manages/publishing_list";
		else
			return "manages/publishing_list";
	}
	
}
