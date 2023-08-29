package com.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dao.EmpDAO;
import com.model.Employee;

@Controller
public class Cont {
	EmpDAO aa;

	@Autowired
	public Cont(EmpDAO aaa) {
		this.aa = aaa;
	}

	ArrayList<Employee> ae;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public void sai() {
		ae = (ArrayList<Employee>) aa.getAllEmployees();
		System.out.println(ae.get(0).getEName());

	}

}
