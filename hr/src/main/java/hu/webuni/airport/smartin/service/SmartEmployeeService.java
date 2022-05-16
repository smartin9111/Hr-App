package hu.webuni.airport.smartin.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.webuni.airport.smartin.configuration.HrConfigProperties;
import hu.webuni.airport.smartin.model.Employee;

@Service
public class SmartEmployeeService  implements EmployeeService{

	@Autowired
	HrConfigProperties config;
	@Override
	public int getPayRaisePercent(Employee employee) {
		
		LocalDateTime startDate = employee.getStartedWorkinTheCompany();
		LocalDateTime thisDate = employee.getStartedWorkinTheCompany().now();
		//Period age = Period.between(startDate, thisDate);
		double diffMonths = (ChronoUnit.MONTHS.between(startDate, thisDate)%12)/12.0;
		double diffDate = (ChronoUnit.YEARS.between(startDate, thisDate))+diffMonths;
		
		
		System.out.println(diffMonths);
		System.out.println(diffDate);

		
		if( diffDate >= config.getHuman().getSmart().getYearlimitsenior()) 
			return config.getHuman().getSmart().getBigpercent();
		if(diffDate >= config.getHuman().getSmart().getYearlimitmedior())  
			return config.getHuman().getSmart().getMediumpercent();
		if(diffDate >= config.getHuman().getSmart().getYearlimitjunior()) 
			return config.getHuman().getSmart().getSmallpercent();
		else return config.getHuman().getSmart().getBeginerpercent();	
	}


}
