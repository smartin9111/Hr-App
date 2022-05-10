package hu.webuni.airport.smartin.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import hu.webuni.airport.smartin.service.EmployeeService;
import hu.webuni.airport.smartin.service.SmartEmployeeService;

@Configuration
@Profile("smart")
public class ProdEmloyeeConfiguration {
	@Bean
	public EmployeeService employeeService() {
		return new SmartEmployeeService();
	}
}
