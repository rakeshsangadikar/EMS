package com.cg.ems.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "employeeCode")
public class EmployeeBean {

	@Id
	int employeeId;

	String employeeName;

	String employeePanNumber;

	String employeeDesignation;

	String employeeDomain;

	LocalDate employeeDateOfJoining;

	LocalDate employeeDateOfBirth;

	double employeeSalary;

	String employeeMailId;

	String employeePassword;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeePanNumber() {
		return employeePanNumber;
	}

	public void setEmployeePanNumber(String employeePanNumber) {
		this.employeePanNumber = employeePanNumber;
	}

	public String getEmployeeDesignation() {
		return employeeDesignation;
	}

	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}

	public String getEmployeeDomain() {
		return employeeDomain;
	}

	public void setEmployeeDomain(String employeeDomain) {
		this.employeeDomain = employeeDomain;
	}

	public LocalDate getEmployeeDateOfJoining() {
		return employeeDateOfJoining;
	}

	public void setEmployeeDateOfJoining(LocalDate employeeDateOfJoining) {
		this.employeeDateOfJoining = employeeDateOfJoining;
	}

	public LocalDate getEmployeeDateOfBirth() {
		return employeeDateOfBirth;
	}

	public void setEmployeeDateOfBirth(LocalDate employeeDateOfBirth) {
		this.employeeDateOfBirth = employeeDateOfBirth;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public String getEmployeeMailId() {
		return employeeMailId;
	}

	public void setEmployeeMailId(String employeeMailId) {
		this.employeeMailId = employeeMailId;
	}

	public String getEmployeePassword() {
		return employeePassword;
	}

	public void setEmployeePassword(String employeePassword) {
		this.employeePassword = employeePassword;
	}

	@Override
	public String toString() {
		return "EmployeeBean [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeePanNumber="
				+ employeePanNumber + ", employeeDesignation=" + employeeDesignation + ", employeeDomain="
				+ employeeDomain + ", employeeDateOfJoining=" + employeeDateOfJoining + ", employeeDateOfBirth="
				+ employeeDateOfBirth + ", employeeSalary=" + employeeSalary + ", employeeMailId=" + employeeMailId
				+ ", employeePassword=" + employeePassword + "]";
	}

	

}
