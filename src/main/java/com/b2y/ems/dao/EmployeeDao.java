package com.b2y.ems.dao;

import com.b2y.ems.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeDao {
    List<Employee> findAll();
    Employee findById(Integer id);
    void save(Employee employee);
    void update(Employee employee);
    void delete(Employee employee);

}
