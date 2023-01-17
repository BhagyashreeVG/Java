package com.infybuzz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infybuzz.response.DepartmentResponse;
import com.infybuzz.service.DepartmentService;

@RestController
@RequestMapping("/api/department")
public class DepartmentController {
	@Autowired
	DepartmentService service;
	
	@GetMapping("/getById/{id}")
	public DepartmentResponse getDepartmentById(@PathVariable int id) {
		return service.getDepartmentById(id);
	}
}
