package hu.webuni.airport.smartin.service;

import org.springframework.stereotype.Service;

import hu.webuni.airport.smartin.model.Employee;

@Service
public class SalaryService {

	private EmployeeService employeeService;
	
	public SalaryService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	public int newSalary(Employee employee) {
		return (int)(employee.getPay()/100*(100+employeeService.getPayRaisePercent(employee)));
		
	}
	
	
}
