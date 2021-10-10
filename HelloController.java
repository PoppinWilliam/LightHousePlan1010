package com.example.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {
	@GetMapping("/hello")
	public String index() {
		return "hello"; // 自动去templates里找到hello.html并返回给用户
	}
}

