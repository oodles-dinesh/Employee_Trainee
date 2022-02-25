package com.example.Employee.service;

import java.util.*;
import java.math.BigDecimal;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.Employee.entity.Emp;
@Service
public class EmployeeImp implements Empinterface {
	List<Emp> list;
	public EmployeeImp()
	{
		list=new ArrayList<>();
		list.add(new Emp(1234,"Dinesh chauhan","cdineshchauhan636896@gmail.com",BigDecimal.valueOf(450000)));
		list.add(new Emp(3423,"Abhinav verma","Abhinav123@gmail.com",BigDecimal.valueOf(68999.45)));
		
	}
	@Override
	public List<Emp> getEmp() {
		
		return list;
	}
	@Override
	public Emp getEmpid(long id) {
		Emp em=null;
		for(Emp emp:list)
		{
			if(emp.getId()==id) {
				em=emp;
				break;
			}
		}
		return em;
	}
	@Override
	public Emp addEmp(Emp empl) {
		list.add(empl);
		return empl;
	}
	@Override
	public void updateEmp(Emp uemp,long idl) {
		list=list.stream().map(b->{if(b.getId()==idl)
		{
			b.setEmp_Name(uemp.getEmp_Name());
			b.setEmail(uemp.getEmail());
		}
		return b;
			
		}).collect(Collectors.toList());
	}
	@Override
	public void deleteEmp(long idl){
	list=list.stream().filter(e->e.getId()!=idl).collect(Collectors.toList());
		
	}

}
