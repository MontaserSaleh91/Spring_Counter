package com.counterproject.counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index(HttpSession session){
		
		if (session.isNew()) {
			session.setAttribute("counter", 0);
		}
		else {
			Integer count = (Integer) session.getAttribute("counter");
			count += 1;
			session.setAttribute("counter", count);
		}
		return "index.jsp";
	}
	
	@RequestMapping("/counter")
	public String counter(HttpSession session) {
		if (session.isNew()) {
			session.setAttribute("counter", 0);
		}
		return "counter.jsp";
	}
}
