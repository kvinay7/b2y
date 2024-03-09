package com.b2y.ems.services;

import com.b2y.ems.dao.EmployeeJpa;
import com.b2y.ems.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
        @Autowired
        private EmployeeJpa employeeJpa;

        public List<Employee> getAllEmployeees() {
            return employeeJpa.findAll();
        }

        public Employee getEmployeeById(Integer id) {
            return employeeJpa.findById(id)
                .orElseThrow(() -> new NotFoundException("Employee not found with id: " + id));
        }
        public Employee createEmployee(Employee employee) {
            return employeeJpa.save(employee);
        }

        public Employee updateEmployee(Integer id, Employee employee) {
            Employee emp = getEmployeeById(id);
            emp.setFirst_name(employee.getFirst_name());
            emp.setLast_name(employee.getLast_name());
            emp.setEmail(employee.getEmail());
            emp.setPhone(employee.getPhone());
            return employeeJpa.save(employee);
        }

        public void deleteEmployee(Integer id) {
            Employee employee = getEmployeeById(id);
            employeeJpa.delete(employee);
        }
    }
