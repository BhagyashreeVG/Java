package com.infybuzz.response;

import com.infybuzz.entity.Department;

public class DepartmentResponse {
	private int id;
	private String name;
	private String head;
	private StudentResponse studentResponse;
	
	public DepartmentResponse(Department dept) {
		this.id = dept.getId();
		this.name = dept.getName();
		this.head = dept.getDeptHead();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHead() {
		return head;
	}
	public void setHead(String head) {
		this.head = head;
	}
	public StudentResponse getStudentResponse() {
		return studentResponse;
	}
	public void setStudentResponse(StudentResponse studentResponse) {
		this.studentResponse = studentResponse;
	}
	
	
}
