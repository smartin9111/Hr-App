package hu.webuni.airport.smartin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.webuni.airport.smartin.configuration.HrConfigProperties;
import hu.webuni.airport.smartin.model.Employee;

@Service
public class DefaultEmployeeService implements EmployeeService {

	@Autowired
	HrConfigProperties config;
	
	@Override
	public int getPayRaisePercent(Employee employee) {
		return config.getHuman().getDef().getPercent();
	}

}
