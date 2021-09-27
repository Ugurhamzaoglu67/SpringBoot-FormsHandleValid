
package com.ugurhmz;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;




@Controller
public class UserController {
	
	
	
	@GetMapping("/")
	public String getIndexPage() {
		
		
		return "index";
	}
	
	
	
	
	// GET REGISTER PAGE
	@GetMapping("/register")
	public String  showRegisterPage(Model model) {
		User user = new User();
		
		List<String> jobList = Arrays.asList("Java Developer","Math engineer","Big Data Engineer");
		model.addAttribute("jobList",jobList);
		model.addAttribute("user",user);
		
		
		return "register_form";
	}
	
	
	
	
	
	// POST REGISTER PAGE
	@PostMapping("/register")
	public String submitRegisterPage(@ModelAttribute("user") User user) {
		
		System.out.println(user.getName()); 	// html sayfasında, inputun içine girilen  th:field="*{name} olanın değerini verir. yani Formdan gelen name="" olan kısmı yakalarız.
		
		return "register_success";
	}
	
	
	
	
	@ModelAttribute("mymessage")
	public String myMessage() {
		
		return "@ModelAttribute ile mesaj";
	}
	
	
	
}


