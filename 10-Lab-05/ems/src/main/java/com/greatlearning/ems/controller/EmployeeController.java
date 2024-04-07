package com.greatlearning.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.greatlearning.ems.entity.Employee;
import com.greatlearning.ems.service.EmployeeService;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@RequestMapping("/employees")
@Controller
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping("/list")
	public String listAllEmployees(Model model){
		
		List<Employee> employees = employeeService.list();
		
		model.addAttribute("employees", employees);
		
		return "list-employees";
	}
	
	
	@RequestMapping("/showEmployeeForm_Save")
	public String saveEmployee_Step1(Model theModel) {

	    // create model attribute to bind form data
	    Employee employee = new Employee();

	    theModel.addAttribute("employee", employee);

	    return "employee-form";
	}    

	@PostMapping("/save")
	public String saveEmployee(
	    @ModelAttribute("employee") Employee employee) {
	    
	    // save the employee
	    employeeService.save(employee);
	    
	    // use a redirect to prevent duplicate submissions
	    return "redirect:/employees/list";
	}
	
}

