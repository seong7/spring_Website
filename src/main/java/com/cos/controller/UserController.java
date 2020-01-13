package com.cos.controller;

import java.util.Locale;

import javax.inject.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.cos.service.CategoryService;

@Controller
public class UserController {

	@Inject
	private CategoryService ctService;
	
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
	public void userLogout() {
	}

}
