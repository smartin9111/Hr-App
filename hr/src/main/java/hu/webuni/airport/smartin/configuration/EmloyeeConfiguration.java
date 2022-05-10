package hu.webuni.airport.smartin.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import hu.webuni.airport.smartin.service.DefaultEmployeeService;
import hu.webuni.airport.smartin.service.EmployeeService;

@Configuration
@Profile("!smart")
public class EmloyeeConfiguration {
	@Bean
	public EmployeeService employeeService() {
		return new DefaultEmployeeService();
	}
}
