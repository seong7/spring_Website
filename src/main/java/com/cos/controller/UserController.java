package com.cos.controller;

import java.util.Locale;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cos.domain.UserVO;
import com.cos.service.CategoryService;
import com.cos.service.UserService;

@Controller
public class UserController {

	@Inject
	private CategoryService ctService;
	@Inject
	private UserService userService;
	
	@RequestMapping(value = "/userLoginForm", method = RequestMethod.GET)
	public String userLoginForm(Model model) throws Exception{
		model.addAttribute("ctg1", ctService.selectGubun1(1));
		model.addAttribute("ctg2", ctService.selectGubun1(2));
		model.addAttribute("ctg3", ctService.selectGubun1(3));
		model.addAttribute("ctg4", ctService.selectGubun1(4));
		return "user/userLoginForm";
	}
	
	@RequestMapping(value = "/userJoinForm", method = RequestMethod.GET)
	public String userJoinForm(Model model, Locale locale) throws Exception{
		model.addAttribute("ctg1", ctService.selectGubun1(1));
		model.addAttribute("ctg2", ctService.selectGubun1(2));
		model.addAttribute("ctg3", ctService.selectGubun1(3));
		model.addAttribute("ctg4", ctService.selectGubun1(4));
		return "user/userJoinForm";
	}
	
	@RequestMapping(value = "/userLogout", method = RequestMethod.GET)
	public String userLogout(HttpSession session) {
		session.invalidate();
		return "redirect:index";
	}

	@RequestMapping(value= "/userJoin", method = RequestMethod.POST)
	public String userJoin(UserVO userVo) throws Exception{
		userService.insert(userVo);
		return "redirect:index";
	}
	
	@RequestMapping(value = "/userLogin", method = RequestMethod.POST)
	public String userLogin(UserVO userVo, HttpServletRequest req) throws Exception{
		String openView = "";
		int result = userService.logIn(userVo);
		if(result == 1) {
			userVo = userService.select(userVo.getUserID());
			HttpSession session = req.getSession();
			session.setAttribute("loggedIn", userVo.getUserID());
			session.setAttribute("userEmail", userVo.getUserEmail());
			session.setAttribute("userName", userVo.getUserName());
			openView = "redirect:index";
		}else {
			openView = "user/userLoginForm";
		}
		
		return openView;
	}
	
}
