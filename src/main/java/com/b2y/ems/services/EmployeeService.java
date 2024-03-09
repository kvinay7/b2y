package com.b2y.ems.services;

import com.b2y.ems.entities.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployeees();
    Employee getEmployeeById(Integer id);
    void createEmployee(Employee employee);
    void updateEmployee(Employee employee);
    void deleteEmployee(Integer id);
}
