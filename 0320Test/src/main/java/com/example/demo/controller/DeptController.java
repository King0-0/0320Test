package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import com.example.demo.dao.DeptDAO;

import lombok.Setter;

@Controller
@Setter
public class DeptController {

	@Autowired
	private DeptDAO dao;
	
	@GetMapping("/listDept")
	public void list(Model model) {
		System.out.println("pull 충돌 테스팅");
		System.out.println("pull 1 충돌 테스트");
		System.out.println("pull 1 충돌 테스트 merge");
		model.addAttribute("list",dao.findAll());
	}
	
	
}
