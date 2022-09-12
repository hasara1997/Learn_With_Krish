package com.krishantha.training.salesmanager.repository;

import java.util.ArrayList;
import java.util.List;

public class HibernateEmployeeRepositoryImpl implements EmployeeRepositoryImpl, com.krishantha.training.salesmanager.service.EmployeeService {

    List<Employee> employees=new ArrayList<>(); // ArrayList to store employees
    Employee employee=new Employee(); //employee object

    @Override
    public List<Employee> getAllEmployees(){

        employee.setEmaployeeName("Maneesha"); //set employee name
        employee.setEmployeeLocation("Anuradhapura"); // set employee location

        employees.add(employee); // add employee to arraylist
        return employees; // return arraylist

    }

}
