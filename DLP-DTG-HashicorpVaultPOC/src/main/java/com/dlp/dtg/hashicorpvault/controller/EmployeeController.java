package com.dlp.dtg.hashicorpvault.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dlp.dtg.hashicorpvault.Employee.*;
import com.dlp.dtg.hashicorpvault.service.*;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService empService;

	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public List<Employee> firstPage() {

		return empService.getAllEmployees();

	}

}