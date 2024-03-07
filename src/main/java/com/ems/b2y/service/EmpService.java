package com.ems.b2y.service;

import com.ems.b2y.model.EmpJpa;
import com.ems.b2y.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {
        @Autowired
        private EmpJpa empJpa;

        public List<Employee> getAllEmp() {
            return empJpa.findAll();
        }

        public Employee getEmployeeById(Integer id) {
            return empJpa.findById(id)
                .orElseThrow(() -> new NotFoundException("Employee not found with id: " + id));
        }
        public Employee createEmployee(Employee employee) {
            return empJpa.save(employee);
        }

        public Employee updateEmployee(Integer id, Employee employee) {
            Employee emp = getEmployeeById(id);
            emp.setFirst_name(employee.getFirst_name());
            emp.setLast_name(employee.getLast_name());
            emp.setEmail(employee.getEmail());
            emp.setPhone(employee.getPhone());
            return empJpa.save(employee);
        }

        public void deleteEmployee(Integer id) {
            Employee employee = getEmployeeById(id);
            empJpa.delete(employee);
        }
    }
