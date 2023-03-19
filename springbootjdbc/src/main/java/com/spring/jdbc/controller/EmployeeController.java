package com.spring.jdbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.jdbc.dao.EmployeeDAO;
import com.spring.jdbc.entity.Employee;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeDAO edao;
	
	@GetMapping("/employees")
	public List<Employee> findAll(){
		return edao.findAll();
	}
	
	@GetMapping("/employee/{id}")
	public Employee findById(@PathVariable int id) {
		return edao.findById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteById(@PathVariable int id) {
		
		return edao.deleteById(id)+" Employee(s) delete from database";
	}
	
	@PostMapping("/employees")
	public String save(@RequestBody Employee e) {
		return edao.save(e)+" Employee(s) saved successfully";
	}
	
	@PutMapping("/employees/{id}")
	public String update(@RequestBody Employee e, @PathVariable int id) {
		return edao.update(e, id)+" Employee(s) updated successfully";
	}
}
