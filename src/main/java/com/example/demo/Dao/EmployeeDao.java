package com.example.demo.Dao;

import com.example.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmployeeDao extends JpaRepository<Employee, UUID> {

}
