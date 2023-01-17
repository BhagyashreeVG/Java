package com.infybuzz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.infybuzz.entity.Department;
import com.infybuzz.feignclients.StudentFeignClient;
import com.infybuzz.repository.DepartmentRepo;
import com.infybuzz.response.DepartmentResponse;

@Service
public class DepartmentService {

	@Autowired
	DepartmentRepo repo;
	
	@Autowired
	StudentFeignClient studentFeignClient;
	
	public DepartmentResponse getDepartmentById(int id) {
		Department dept = repo.findById(id).get();
		DepartmentResponse deptResponse = new DepartmentResponse(dept);
		deptResponse.setStudentResponse(studentFeignClient.getById(dept.getStudentId()));
		return deptResponse;
	}

}
