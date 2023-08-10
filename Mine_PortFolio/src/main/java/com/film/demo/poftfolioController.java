package com.film.demo;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.film.demo.beans.MsgBean;
import com.film.demo.service.MsgDAO;

@Controller
public class poftfolioController {
	
	@Autowired
	private MsgDAO dao;
	
	@GetMapping("/")
	public String welcome(Model m) {
		m.addAttribute("menu", "index");
		return "index";
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute("msg") MsgBean msg) {
		dao.save(msg);
		return "redirect:/";
	}
	
}
