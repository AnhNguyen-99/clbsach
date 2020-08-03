package com.clbsach.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.clbsach.entity.Account;
import com.clbsach.entity.User;
import com.clbsach.service.UserService;

@Controller
@RequestMapping(value = "manages/user")
public class ControllerUser {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/list")
	public String viewList(Model model) {
		model.addAttribute("listUser", userService.getAll());
		return "manages/user_list";
	}
	
	@RequestMapping(value = "/create")
	public String viewCreate(Model model) {
		model.addAttribute("user", new User());
		return "manages/user_form";
	}
	
	@RequestMapping(value = "/update/{userId}")
	public String viewUpdate(@PathVariable("userId") int userId, Model model) {
		model.addAttribute("user", userService.findById(userId));
		return "manages/user_form";
	}
	
	@RequestMapping(value = "/save")
	public String viewSave(@ModelAttribute("user") User user, HttpSession session) {
		boolean bl = false;
		Account account = (Account) session.getAttribute("myLogin");
		user.setAccount(account);
		user.setPassword("1");
		if(user.getUserId() == null) {
			bl = userService.save(user);
		}else
			bl = userService.update(user);
		if(bl)
			return "redirect:list";
		else
			return "manages/user_form";
	}
	
	@RequestMapping(value = "/delete/{userId}")
	public String viewDelete(@PathVariable("userId") int userId) {
		User user = userService.findById(userId);
		boolean bl = userService.delete(user);
		if(bl)
			return "manages/user_list";
		else
			return "manages/user_list";
	}
	
	@RequestMapping(value = "/init_reset")
	public String viewReset() {
		return "manages/user_reset";
	}
	
	@RequestMapping(value = "/reset", method = RequestMethod.GET)
	public String viewUserName(@RequestParam("username") String userName, Model model) {
		System.out.println(userName);
		User user = userService.findByName(userName);
		user.setPassword("1");
		boolean bl = userService.update(user);
		if(bl) {
			model.addAttribute("status", 1);
			return "manages/user_reset";
		}
		else {
			model.addAttribute("status", 0);
			return "manages/user_reset";
		}
	}
	
}
