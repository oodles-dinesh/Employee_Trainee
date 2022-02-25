package com.example.Employee.entity;

import java.math.BigDecimal;

public class Emp {
	private long id;
	private String Emp_Name;
	private String Email;
	private BigDecimal salary;
	public Emp(long id, String emp_Name, String email, BigDecimal d) {
		super();
		this.id = id;
		Emp_Name = emp_Name;
		Email = email;
		this.salary = d;
	}
	
	@Override
	public String toString() {
		return "Emp [id=" + id + ", Emp_Name=" + Emp_Name + ", Email=" + Email + ", salary=" + salary + "]";
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEmp_Name() {
		return Emp_Name;
	}
	public void setEmp_Name(String emp_Name) {
		Emp_Name = emp_Name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

}
