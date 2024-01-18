package com.example.smallwebProj;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class RegController {
	
	@Autowired
	 private UserRepository userRepository;
	
	
	@GetMapping("")
	public String viewHomepage() {
		return "index";
	}
	
	@GetMapping("/users")
	public String viewUsers(Model model) {
		User user=new User();
		
		model.addAttribute("user", user);
		
		return "users";
	}
	
	@GetMapping("/register")
	public String regform(Model model) {
		User user=new User();
		
		model.addAttribute("user", user);
	    
	    return "register";
		
	}
	
//	@PostMapping ("/register")
//	public String showform(@ModelAttribute("user")User user) {
//		System.out.println(user);
//	     
//	    return "user_detail";
//	}
	
	
	@GetMapping("/process_register")
	public String processRegister(@ModelAttribute("user") User user) {
		System.out.println(user);
	    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	    String encodedPassword = passwordEncoder.encode(user.getPassword());
	    user.setPassword(encodedPassword);
	     
	    userRepository.save(user);
	     
	    return "success";
	}
	
	 
}
