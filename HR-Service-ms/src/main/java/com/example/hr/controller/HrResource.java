package com.example.hr.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hr.bean.Employee;


@RestController
	@RequestMapping("/hr")
	public class HrResource {
		
		//Hardcoded list of employees
		List<Employee> emp = Arrays.asList(
			new Employee("e1", "sainaveen", "somaraju", "abcd"),
			new Employee("e2", "eswar", "somaraju", "Surgery"),
			new Employee("e3", "markandey", "marks", "Cradiaology")
		);
		/*
		@RequestMapping("/employees")
		public List<Employee> getEmployees() {
			
			return employees;
		}
	*/
		
		//getEmployees returns list of employees
		@RequestMapping("/employees")
		public EmployeesList getEmployees() {
			
			EmployeesList employeesList = new EmployeesList();
			employeesList.setEmployees(employees);		
			return employeesList;
		}
		
		//getEmployeeById returns an employee with the given Id
		@RequestMapping("/employees/{Id}")
		public Employee getEmployeeById(@PathVariable("Id") String Id) {
			Employee e = employees.stream()
					.filter(employee ->Id.equals(employee.getId()))
					.findAny()
					.orElse(null);
			return e;
		}		
	}