package com.pepcus.employee.service;

import java.util.List;

import com.pepcus.employee.modal.Address;
import com.pepcus.employee.modal.Employee;
public interface EmployeeService {

	Employee insertEmployee(Employee employee);

	List<Employee> getAllEmployee();

	String getDeleteEmployeeById(int id);

	Address insertAddress(Address address);

	Employee updateEmployee(Employee employee);
    
}




