package com.cos.controller;



import javax.inject.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cos.service.CategoryService;

@Controller
public class AdminController {

	@Inject
	private CategoryService ctService;
	
	@RequestMapping(value = "/adminContact", method = RequestMethod.GET)
	public String adminContact(Model model) throws Exception{
		model.addAttribute("ctg1", ctService.selectGubun1(1));
		model.addAttribute("ctg2", ctService.selectGubun1(2));
		model.addAttribute("ctg3", ctService.selectGubun1(3));
		model.addAttribute("ctg4", ctService.selectGubun1(4));
		return "admin/adminContact";
	}

}
