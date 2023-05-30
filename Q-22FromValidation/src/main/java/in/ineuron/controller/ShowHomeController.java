package in.ineuron.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import in.ineuron.model.User;
import in.ineuron.service.UserServie;

@Controller
public class ShowHomeController {
	@Autowired
	private UserServie service;

	@GetMapping("/")
	public String showHomePage() {
		return "home";
	}

	@GetMapping("/register")
	public String showRegisterPage() {
		return "register";
	}
	@GetMapping("/login")
	public String showloginPage() {
		return "login";
	}

	@PostMapping(value = "/save")
	public String saveUser(Map<String, Object> map, @ModelAttribute() User user) {
		User user1 = service.findByUsername(user.getUsername());
		if (user1 == null) {
			service.registerUser(user);
			return "login";
		}
		else
			return "register2";

	}

	@PostMapping(value = "/verify")
	public String verify(Map<String, Object> map, HttpServletRequest request) {
		String name = request.getParameter("username");
		System.out.println(name);
		String pass = request.getParameter("password");
		System.out.println(pass);
		User user = service.findByUsername(name);
		System.out.println(user);
		if (user.getPassword().equals(pass)) {
			System.out.println("user logged succesfully");
			return "welcome";
		}
		return "errorPage";

	}
}
