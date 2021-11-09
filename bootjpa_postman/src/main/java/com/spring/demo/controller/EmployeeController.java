package com.spring.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.demo.dao.EmployeeRepo;
import com.spring.demo.model.Employee;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeRepo repo;

	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}

	@PostMapping(path="/employee", consumes= {"application/json"})
	public Employee addEmployee(@RequestBody Employee employee) {
		repo.save(employee);
		return employee;
	}
//	@RequestMapping("/getEmployee")
//	public ModelAndView getEmployee( @RequestParam int eid) {
//		ModelAndView mv=new ModelAndView("show.jsp");
//		employee  employee=repo.findById(eid).orElse(new employee());
//		System.out.println(repo.findByEid(101));
//		System.out.println(repo.findByEidGreaterThan(102));
//		System.out.println(repo.findByEidSorted(101));
//	mv.addObject(employee);
//		return mv;
//	}
	
	@GetMapping(path="/employees")
	public List<Employee> getEmployees() {
		
		
		return repo.findAll();
	}
	
	@RequestMapping("/employee/{eid}")
	public Optional<Employee> getEmployee(@PathVariable("eid") int eid) {
		
		
		return repo.findById(eid);
	}
	
	@DeleteMapping("/employee/{eid}")
	public String deleteEmployee(@PathVariable int eid) {
		Employee emp = repo.getOne(eid);
		repo.delete(emp);
		return "Data deleted";
	}
	
	@PutMapping(path="/employee", consumes= {"application/json"})
	public Employee updateEmployee(@RequestBody Employee employee) {
		repo.save(employee);
		return employee;
	}
	
}
