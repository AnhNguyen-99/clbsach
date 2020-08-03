package com.clbsach.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.clbsach.entity.Account;
import com.clbsach.entity.Ticketborrow;
import com.clbsach.service.BookService;
import com.clbsach.service.TicketBorrowService;
import com.clbsach.service.UserService;

@Controller
@RequestMapping(value = "manages/ticketborrow")
public class ControllerTicketBorrow {

	@Autowired
	private TicketBorrowService ticketBorrowService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private BookService bookService;
	
	@RequestMapping(value = "/list")
	public String viewList(Model model) {
		model.addAttribute("listTicketBorrow", ticketBorrowService.getAll());
		return "manages/ticketborrow_list";
	}
	
	@RequestMapping(value = "/create")
	public String viewCreate(Model model) {
		model.addAttribute("ticketBorrow", new Ticketborrow());
		model.addAttribute("listUser", userService.getAll());
		model.addAttribute("listBook", bookService.getAll());
		return "manages/ticketborrow_form";
	}
	
	@RequestMapping(value = "/save")
	public String viewSave(@ModelAttribute("ticketBorrow") Ticketborrow ticketborrow, HttpSession session) {
		Account account = (Account) session.getAttribute("myLogin");
		ticketborrow.setAccount(account);
		boolean bl = ticketBorrowService.save(ticketborrow);
		if(bl)
			return "redirect:list";
		else
			return "manages/ticketborrow_form";
	}
}
