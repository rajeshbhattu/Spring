package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.User;
import com.example.demo.service.IUserServiceImpl;

@Controller
public class UserController {
	@Autowired
	private IUserServiceImpl service;
	
	//1.Show Register Page
	@GetMapping("/reg")
	public String showReg() {
		return "UserRegister";
		
	}
	//2.Read Form for save operation
	@PostMapping("/save")
	public String saveUser(@ModelAttribute User user,Model model) {
		Integer id = service.saveUser(user);
		String msg = "user '"+id+"' saved";
		model.addAttribute("message",msg);
		return "UserRegister";
	}

}
