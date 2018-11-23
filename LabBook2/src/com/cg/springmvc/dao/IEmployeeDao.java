package com.cg.springmvc.dao;

import java.util.List;

import com.cg.springmvc.dto.Employee;

public interface IEmployeeDao {

	public int addEmployeeData(Employee emp);
	public List<Employee> showAllEmployee();
	public void deleteEmployee(int empId);
	public boolean updateEmployee(Employee emp);
	public Employee searchEmployee(int empId);

}
