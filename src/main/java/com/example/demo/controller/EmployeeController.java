package com.example.demo.controller;


import com.example.demo.entity.Employee;
import com.example.demo.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

<<<<<<< HEAD
    @Value("${my.first.name}")
    private String myFirstName;

    public EmployeeController(String myFirstName) {
        this.myFirstName = myFirstName;
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String Welcome(){
        return "Welcome to Rest Application " + myFirstName;
    }

    @GetMapping("/user/allEmployee")
=======
    @GetMapping("/User/AllEmployee")
>>>>>>> dev2
    public ResponseEntity getEmployeeUser(){
        List<Employee> l = employeeService.getEmployeeUser();
        try{
            if(l.size() <= 0){
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Empty List");
            }
            return ResponseEntity.of(Optional.of(l));
        }
        catch(Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Internal Server Error");
        }
    }

    @PostMapping("/User/AddEmployee")
    public ResponseEntity addEmployeeUser(@RequestBody Employee employee){
        Employee employee1 = null;
        try{
            employee1 = employeeService.addEmployeeUser(employee);
            if(employee1 == null){
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("something wrong is datatype pr query");
            }
            return ResponseEntity.status(HttpStatus.CREATED).body("Employee is added successfully");
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
