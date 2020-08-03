package com.clbsach.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.clbsach.entity.Feedback;
import com.clbsach.entity.User;
import com.clbsach.service.AuthorService;
import com.clbsach.service.BookService;
import com.clbsach.service.CategoryService;
import com.clbsach.service.FeedBackService;
import com.clbsach.service.UserService;

@Controller
public class ControllerPage {

	@Autowired
	private FeedBackService feedBackService;
	
	@Autowired
	private BookService bookService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private AuthorService authorService;
	
	@RequestMapping(value = "/trangchu")
	public String viewHomePage(Model model) {
		return "page/index";
	}
	
	@RequestMapping(value = "/book")
	public String viewBook(Model model) {
		model.addAttribute("listBook", bookService.getAll());
		model.addAttribute("listCategory", categoryService.getAll());
		model.addAttribute("listAuthor", authorService.getAll());
		return "page/book";
	}
	
	@RequestMapping(value = "/co-cau-to-chuc")
	public String viewStructre(Model model) {
		return "page/structure";
	}
	
	@RequestMapping(value = "/gioithieu")
	public String viewIntroduce(Model model) {
		return "page/introduce";
	}
	
	@RequestMapping(value = "/extension")
	public String viewExtension(Model model) {
		return "page/extension";
	}
	
	// Lịch sử mượn sách của user
	@RequestMapping(value = "/lich-su-muon")
	public String viewHistory(Model model) {
		return "page/user_history";
	}
	
	// Thay đổi thông tin
	@RequestMapping(value = "/thaydoithongtin")
	public String viewChange(Model model, HttpSession session) {
		User user = (User) session.getAttribute("user");
		if(user == null)
			return "redirect:login";
		else {
			model.addAttribute("user", user);
			return "page/user_change";
		}
	}
	
	@RequestMapping(value = "/thaydoimatkhau", method = RequestMethod.POST)
	public String viewChangePass(@ModelAttribute("user") User user,@RequestParam("password_1") String password_1, @RequestParam("password_2")String password_2, Model model) {
		if(password_1 != password_2) {
			model.addAttribute("status", 1);
			return "";
		}else {
			user.setPassword(password_1);
			boolean bl = userService.update(user);
			if(bl) {
				model.addAttribute("status", 2);
				return "redirect:trangchu";
			}else {
				model.addAttribute("status", 3);
				return "redirect:thaydoithongtin";
			}			
		}
	}
	
	// Phản hồi
	@RequestMapping(value = "/phan-hoi")
	public String viewFeedBack(Model model) {
		model.addAttribute("feedBack", new Feedback());
		return "page/feedback";
	}
	
	@RequestMapping(value = "/save_feedback")
	public String viewSaveFeedBack(@ModelAttribute("feedBack") Feedback feedBack, Model model) {
		boolean bl = feedBackService.save(feedBack);
		if(bl) {
			model.addAttribute("status", 1);
			return "page/feedback";
		}else {
			model.addAttribute("status", 0);
			return "page/feedback";
		}
	}
	
	// Login user
	@RequestMapping(value = "/login")
	public String viewLoginUser(Model model) {
		model.addAttribute("user", new User());
		return "page/login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String viewLogin(@ModelAttribute("user") User user, Model model, HttpSession session) {
		User users = userService.login(user.getUsername(), user.getPassword());
		if(users == null) {
			model.addAttribute("user", new User());
			model.addAttribute("status", 1);
			return "page/login";
		}else {
			session.setAttribute("user", users);
			return "redirect:trangchu";
		}
	}
		
}
