package dao;

import java.util.ArrayList;

import model.Employee;

public interface EmployeeDao {
	
	ArrayList<Employee> findAllEmployee();
	Employee findEmployeeById(int id);
	Employee saveEmployee(Employee e);
	Employee deleteEmployee(int id);
	Employee updateEmployee(Employee s);
	
	
	
}
