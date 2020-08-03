package com.clbsach.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.clbsach.service.TicketPayService;

@Controller
@RequestMapping(value = "manages/ticketpay")
public class ControllerTicketPay {

	@Autowired
	private TicketPayService ticketPayService;
	
	@RequestMapping(value = "/list")
	public String viewList(Model model) {
		model.addAttribute("listTicketPay", ticketPayService.getAll());
		return "manages/ticketpay_list";
	}
}
