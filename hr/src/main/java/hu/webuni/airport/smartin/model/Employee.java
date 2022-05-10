package hu.webuni.airport.smartin.model;

import java.time.LocalDateTime;

public class Employee {
	
	private long companyId;
	private String name;
	private int pay;
	private LocalDateTime startedWorkinTheCompany;

	public Employee(long companyId, String name, int pay, LocalDateTime startedWorkinTheCompany) {
		this.companyId = companyId;
		this.name = name;
		this.pay = pay;
		this.startedWorkinTheCompany = startedWorkinTheCompany;
	}
	
	public long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	public LocalDateTime getStartedWorkinTheCompany() {
		return startedWorkinTheCompany;
	}

	public void setStartedWorkinTheCompany(LocalDateTime startedWorkinTheCompany) {
		this.startedWorkinTheCompany = startedWorkinTheCompany;
	}
	
}
