package com.example.Employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeTraineeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeTraineeApplication.class, args);
		//System.setProperty("server.servlet.context-path","/homepage");
		//System.setProperty("server.port", "9092");
	}

}
