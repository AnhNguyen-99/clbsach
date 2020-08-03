package com.clbsach.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.clbsach.entity.Account;
import com.clbsach.entity.AccountRole;
import com.clbsach.service.AccountService;

@Controller
@RequestMapping(value = "manages")
public class ControllerLogin {

	@Autowired
	private AccountService accountService;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String viewInitLogin(Model model) {
		model.addAttribute("account", new Account());
		return "manages/login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String viewLogin(@ModelAttribute("account") Account account, Model model, HttpSession session) {
		Account acc = accountService.login(account.getAccountName(), account.getAccountPass());
		if(acc == null) {
			model.addAttribute("account", new Account());
			session.setAttribute("myLogin", null);
			return "manages/login";
		}else {
			session.setAttribute("myLogin", acc);
			return "redirect:homeLogin";
		}
	}
	
	@RequestMapping(value = "/homeLogin")
	public String viewHomeLogin(Model model, HttpSession session) {
		Account account = (Account) session.getAttribute("myLogin");
//		AccountRole accountRole = accountService.login_role(account.getAccountId());
//		if(accountRole.getRole().getRoleId() == 3) {
//			return "redirect:home";
//		}else {
//		if(account == null) {
//			return "page/login";
//		}else {
//			int total_roleId = accountService.total_roleId(1);
//			System.out.println(total_roleId);
//			if(total_roleId == 1) {
//				return "redirect:manages/home";
//			}else {
//				model.addAttribute("listRole", accountService.getListByAccountId(account.getAccountId()));
//				return "manages/login";
//			}
//		}
		if(account == null) {
			return "redirect:login";
		}else {
			AccountRole accountRole = accountService.login_role(account.getAccountId());
			if(accountRole.getRole().getRoleId() == 1)
				return "redirect:home";
			else
				return "redirect:home";
		}
	}
	
	@RequestMapping(value = "/home")
	public String viewManagesHome() {
		return "manages/index";
	}
	
}
