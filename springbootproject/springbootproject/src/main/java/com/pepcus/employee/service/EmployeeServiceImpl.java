package com.pepcus.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pepcus.employee.customexception.BusinessException;
import com.pepcus.employee.modal.Address;
import com.pepcus.employee.modal.Employee;
import com.pepcus.employee.repository.AddressRepository;
import com.pepcus.employee.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepository employeerepository;
	@Autowired
	AddressRepository addressrepository;

	@Override
	public Employee insertEmployee(Employee employee) {

		return employeerepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {
	//	try {
			List<Employee> employeelist = (List<Employee>) employeerepository.findAll();
			//if(employeelist.isEmpty())
	
			//	throw  new BusinessException("601", "Hey List Completely Empty, We have not any Data in Database");
				return employeelist;
		//}catch (Exception e) {
		      // throw new BusinessException("602","Somthing Went Wroung in Service Layer While Fetching All Employee"+e.getMessage());
		}
	

	@Override
	public String getDeleteEmployeeById(int id) {
		try {
			employeerepository.deleteById(id);
		} catch (Exception e) {
			return "Employee id not found==>" + id;
		}
		return "Employee delete Successfully==>" + id;
	}

	@Override
	public Address insertAddress(Address address) {
		
		return addressrepository.save(address);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		
		return null;
	}

}


