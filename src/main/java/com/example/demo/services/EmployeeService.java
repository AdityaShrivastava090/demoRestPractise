package com.example.demo.services;


import com.example.demo.entity.Employee;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface EmployeeService {

    public List<Employee> getEmployeeUser();

    public Employee addEmployeeUser(Employee employee);



}
