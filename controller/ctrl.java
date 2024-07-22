package com.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.controller.map;

@Controller
public class ctrl {
	@Autowired
	private map ma;

	@GetMapping("/")
	public String start() {
		
		return "start.html";
	}
	
	@GetMapping("/create")
	public String create() {
		
		
		return "create.html";
	}
	
	@GetMapping("/login")
	public String login() {
		
		
		
		
		return "login.html";
	}
	@PostMapping("/start")
	public String start2(@RequestParam String id,
						@RequestParam String pw, 
						@RequestParam String name) {
		
		ma.Map_insert(id, pw, name);
		
		
		return "start.html";
	}
	
	@PostMapping("/user")
	public String user(@RequestParam String id,
						@RequestParam String pw) {
		
		Iterator<dto> it = ma.Map_select().iterator();
		
		while(it.hasNext()) {
			
			dto login = it.next();
			
			if(login.getId().equals(id) && login.getPw().equals(pw)){
				
				return "user.html";
			}
			
		}
		
		
		
		return "Nouser.html";
	}
	
	@GetMapping("/Nouser")
	public String Nouser() {
		
		return "Nouser.html";
	}
	
	
	
	
	
	
	
}
