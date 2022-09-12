package com.krishantha.training.salesmanager.model;

import com.krishantha.training.salesmanager.repository.Employee;
import com.krishantha.training.salesmanager.service.EmployeeService;
import com.krishantha.training.salesmanager.service.EmployeeServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ModelApplication {

	public static void main(String[] args) {
		EmployeeService service=new EmployeeServiceImpl();
		List<Employee> employees= service.getAllEmployees();

		for (Employee employee:employees){
			System.out.println(employee.getEmaployeeName() +" at "+employee.getEmployeeLocation());

		}
	}

}
