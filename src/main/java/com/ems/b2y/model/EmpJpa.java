package com.ems.b2y.model;

import com.ems.b2y.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpJpa extends JpaRepository<Employee, Integer> {

}
