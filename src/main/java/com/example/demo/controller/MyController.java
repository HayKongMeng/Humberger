package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.Burgur;
import com.example.demo.repo.burgurRepo;


@Controller
public class MyController {
	@Autowired
	private burgurRepo burgarBurgurRepo;
	
	@GetMapping("/")
	public String myHome(Model mod) {
		
		List<Burgur> lists = (List<Burgur>)burgarBurgurRepo.findAll();
		mod.addAttribute("bgs", lists);
		return "index";
	} 
}
