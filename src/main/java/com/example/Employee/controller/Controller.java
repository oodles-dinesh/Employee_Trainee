package com.example.Employee.controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Employee.entity.Emp;
import com.example.Employee.service.Empinterface;


@RestController
@RequestMapping("/")
public class Controller {
	@Autowired
	private Empinterface empinterface;

//	private EmployeeSpringConfigure employeeSpringConfigure;
	org.slf4j.Logger logger =LoggerFactory.getLogger(Controller.class);
	@GetMapping("/home")
	public String home() {
		 logger.trace("This is wrong API");
		return "this is homepage";
	}
	@GetMapping("/emp")
	public List<Emp> getEmp()
	{
		return this.empinterface.getEmp();
	}
  @GetMapping("/emp/{id}")
  public Emp getEmpid(@PathVariable("id") long id)
  {
	  return this.empinterface.getEmpid(id);
  }
  @PostMapping("/emp")
  public Emp addEmp(@RequestBody Emp empl)
  {
	  return this.empinterface.addEmp(empl);
  }
  @PutMapping("/emp/{id}")
  public Emp updateEmp(@RequestBody Emp uemp,@PathVariable("id") long idl)
  {
	  this.empinterface.updateEmp(uemp,idl);
	  return uemp;
	  
  }
  //@DeleteMapping("/emp/{id}")
  //public void deleteEmp(@PathVariable("id") long idl)
 // {
	//   this.empinterface.deleteEmp(idl);
	 
  //}
  @DeleteMapping("/emp/{id}")
  public ResponseEntity<HttpStatus> deleteEmp(@PathVariable("id") long idl)
  {
	  try {
		  this.empinterface.deleteEmp(idl);
		  return new ResponseEntity<>(HttpStatus.OK);
	  }
	  catch(Exception e)
	  {
		  return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	  }
  }
}
