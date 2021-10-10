package com.example.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	@GetMapping("/login")
	public String login() {
		return "login"; // 自动去templates里找到login.html并返回给用户
	}
	
	@PostMapping("/home") // 匹配html中action为“/home”的form标签
	public String validate(@RequestParam("username") String userName, @RequestParam("password") String password) {
		if(userName.equals("admin") && password.equals("admin")) {
			return "redirect:/hello"; // 用户名和密码为admin，则重新定向到GetMapping("/hello")
		}
		return "redirect:/login"; // 否则重新定向到GetMapping("/login")
		
	}
}
