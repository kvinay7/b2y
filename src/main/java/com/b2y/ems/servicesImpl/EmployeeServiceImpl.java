package com.b2y.ems.servicesImpl;

import com.b2y.ems.dao.EmployeeDao;
import com.b2y.ems.entities.Employee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements com.b2y.ems.services.EmployeeService {
        @Autowired
        private EmployeeDao employeeDao;

        @Override
        public List<Employee> getAllEmployeees() {
            return employeeDao.findAll();
        }

        @Override
        public Employee getEmployeeById(Integer id) {
            return employeeDao.findById(id);
        }

        @Transactional
        @Override
        public void createEmployee(Employee employee) {
            employeeDao.save(employee);
        }

        @Transactional
        @Override
        public void updateEmployee(Employee employee) {
            employeeDao.update(employee);
        }

        @Transactional
        @Override
        public void deleteEmployee(Integer id) {
            Employee employee = getEmployeeById(id);
            employeeDao.delete(employee);
        }
    }
