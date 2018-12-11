package com.cg.ems.service;

import java.util.List;
import java.util.NoSuchElementException;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ems.dao.IEmployeeRepository;
import com.cg.ems.entity.EmployeeBean;
import com.cg.ems.exception.ECMException;

@Transactional
@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	IEmployeeRepository employeeRepository;

	// Add Employee
	@Override
	public void addEmployee(EmployeeBean employee) {

		EmployeeBean employeeBean = employeeRepository.save(employee);
		if (employeeBean == null)
			throw new ECMException("Employee already exists");

	}

	// Get Employee
	@Override
	public EmployeeBean getEmployee(int empId) {
		try {
			EmployeeBean employee = employeeRepository.findById(empId).get();
			return employee;
		} catch (Exception e) {
			throw new NoSuchElementException("Employee not present with Id: " + empId);

		}

	}

	// GetAll Employee
	@Override
	public List<EmployeeBean> getAllEmployees() {

		return (List<EmployeeBean>) employeeRepository.findAll();
	}

	// Update Employee
	@Override
	public void updateEmployee(EmployeeBean employee) {
		if (employee != null)
			employeeRepository.save(employee);
	}

	// Delete Employee
	@Override
	public void deleteEmployee(int empId) {
		try {
			EmployeeBean employee = employeeRepository.findById(empId).get();
			employeeRepository.delete(employee);
		} catch (Exception e) {
			throw new NoSuchElementException("Employee not present with Id: " + empId);

		}
	}
}
