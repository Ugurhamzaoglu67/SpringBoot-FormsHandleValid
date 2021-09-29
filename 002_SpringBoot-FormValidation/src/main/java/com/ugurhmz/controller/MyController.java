package com.ugurhmz.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.ugurhmz.entries.LoginDataModel;

@Controller
public class MyController {

	
	// GET LOGIN FORM
	@GetMapping("/myform")
	public String getMyFormPage(Model model) {
		
		LoginDataModel loginData = new LoginDataModel();
		model.addAttribute("loginData",loginData);
		
		
		return "form";
	}
	
	
	
	// POST LOGIN FORM
	@PostMapping("/formpost")
	public String submitLoginForm(
			@Valid @ModelAttribute("loginData") LoginDataModel loginDataModel,
			BindingResult result,RedirectAttributes ra) 
	{
		
		
		if(result.hasErrors()) {
			
			System.out.println(result);
			return "form";
		}
		
		
		System.out.println(loginDataModel);
		ra.addFlashAttribute("loginDataModelmessage",loginDataModel);
		
		return "redirect:/myform";
	}
	
	
	
}
