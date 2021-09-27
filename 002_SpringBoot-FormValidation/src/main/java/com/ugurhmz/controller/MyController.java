package com.ugurhmz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ugurhmz.entries.LoginDataModel;




@Controller
public class MyController {

	
	
	@GetMapping("/myform")
	public String getMyFormPage(Model model) {
		
		LoginDataModel loginData = new LoginDataModel();
		
		model.addAttribute("loginData",loginData);
		
		
		return "form";
	}
	
}
