package com.dlp.dtg.hashicorpvault.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlp.dtg.hashicorpvault.Employee.*;
import com.dlp.dtg.hasicorpvault.DAO.*;
import com.dlp.dtg.hashicorpvault.service.*;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao employeeDao;

	public List<Employee> getAllEmployees() {
		List<Employee> employees = employeeDao.getAllEmployees();
		return employees;
	}
	
}