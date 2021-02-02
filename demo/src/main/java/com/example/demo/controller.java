package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller {

	@Autowired
	MessageRepo msg;
	@RequestMapping("/")
	public String home() {
		return "Welcome.jsp";
	}

	@RequestMapping("/addmessage")
	public String Addmessage(String uname, String message, Integer id) {
		Message m = new Message(uname, message, id);
		msg.save(m);
		return "Welcome.jsp";
	}
}
