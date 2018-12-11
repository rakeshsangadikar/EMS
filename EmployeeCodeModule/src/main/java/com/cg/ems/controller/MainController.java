package com.cg.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ems.entity.EmployeeBean;
import com.cg.ems.service.IEmployeeService;

@RestController
@RequestMapping("/api")
public class MainController {

	@Autowired
	IEmployeeService employeeService;

	// Add Employee
	@PostMapping(path = "/employees")
	public String addEmployee(@RequestBody EmployeeBean employee) {
		employeeService.addEmployee(employee);
		return "Employee added Successfully with Id: " + employee.getEmployeeId();
	}

	// ReadById
	@GetMapping(path = "/get/{empId}")
	public EmployeeBean getEmployee(@PathVariable int empId) {
		EmployeeBean employee = employeeService.getEmployee(empId);
		return employee;
	}

	// GetAll
	@GetMapping("/getAll")
	public List<EmployeeBean> getAllEmployees() {
		return employeeService.getAllEmployees();
	}

	// Update
	@PutMapping("/update")
	public String updateEmployee(@RequestBody EmployeeBean employee) {
		employeeService.updateEmployee(employee);
		return "Successfully Updated Employee with Id: " + employee.getEmployeeId();
	}

	// Delete
	@DeleteMapping("/delete/{empId}")
	public String deleteEmployee(@PathVariable int empId) {
		employeeService.deleteEmployee(empId);
		return "Successfully Deleted Employee with Id:" + empId;
	}

}
