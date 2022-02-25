package com.example.Employee.service;

import java.util.List;

import com.example.Employee.entity.Emp;

public interface Empinterface {
	public List<Emp> getEmp();
	 public Emp getEmpid(long id);
	 public Emp addEmp(Emp empl);
	 public void updateEmp(Emp uemp,long idl);
	 public void deleteEmp( long idl);

}
