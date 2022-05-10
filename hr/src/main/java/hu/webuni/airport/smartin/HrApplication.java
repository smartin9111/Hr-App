package hu.webuni.airport.smartin;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.format.datetime.joda.LocalDateParser;

import hu.webuni.airport.smartin.model.Employee;
import hu.webuni.airport.smartin.service.DefaultEmployeeService;
import hu.webuni.airport.smartin.service.EmployeeService;
import hu.webuni.airport.smartin.service.SalaryService;
import hu.webuni.airport.smartin.service.SmartEmployeeService;

@SpringBootApplication
public class HrApplication implements CommandLineRunner{

	
	@Autowired
	SalaryService salaryService;
	
	public static void main(String[] args) {
		SpringApplication.run(HrApplication.class, args);
	}

	
	@Override
	public void run(String... args) throws Exception {
		Employee lajos = new Employee(1,"Tóth Lajos", 450000, LocalDateTime.parse("2005-04-30T10:15:30"));
		Employee taksony = new Employee(1,"Kovács Taksony", 550000, LocalDateTime.parse("2021-05-31T10:15:30"));
		Employee elemer = new Employee(1,"Gipsz Elemér", 350000, LocalDateTime.parse("2018-05-31T10:15:30"));
		
		System.out.println(salaryService.newSalary(lajos));
		System.out.println();
		System.out.println(salaryService.newSalary(taksony));	
		System.out.println();
		System.out.println(salaryService.newSalary(elemer));

	}	
	
}
