package com.b2y.ems.dao;

import com.b2y.ems.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeJpa extends JpaRepository<Employee, Integer> {

}
