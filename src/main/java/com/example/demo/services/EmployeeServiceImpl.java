package com.example.demo.services;


import com.example.demo.Dao.EmployeeDao;
import com.example.demo.Dao.EmployeeDaoImpl;
import com.example.demo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private EmployeeDaoImpl employeeDaoImpl;

    @Override
    public List<Employee> getEmployeeUser(){return employeeDao.findAll();}

    @Override
    public Employee addEmployeeUser(Employee employee){
        employeeDaoImpl.saveData(employee);
        return employee;
    }

}
