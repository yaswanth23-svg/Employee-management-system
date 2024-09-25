package com.mintu.Technologies.Employee.service;

import com.mintu.Technologies.Employee.model.Employee;
import com.mintu.Technologies.Employee.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepository;

    // Save or create an employee
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    // Get all employees
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // Get employee by ID
    public Optional<Employee> getEmployeeById(String id) {
        return employeeRepository.findById(id);
    }

    // Update employee
    public void updateEmployee(Employee employee) {
        employeeRepository.save(employee);  // save() method will update if the employee ID already exists
    }

    // Delete employee by ID
    public void deleteEmployeeById(String id) {
        employeeRepository.deleteById(id);
    }
}
