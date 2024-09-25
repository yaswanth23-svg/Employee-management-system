package com.mintu.Technologies.Employee.controller;

import com.mintu.Technologies.Employee.model.Employee;
import com.mintu.Technologies.Employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // Create or Save Employee
    @PostMapping("/saveEmployee")
    public String saveEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
        return "Employee saved successfully!";
    }

    // Get all employees
    @GetMapping("/getAllEmployees")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    // Get employee by ID
    @GetMapping("/getEmployee/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable String id) {
        return employeeService.getEmployeeById(id);
    }

    // Update an employee
    @PutMapping("/updateEmployee")
    public String updateEmployee(@RequestBody Employee employee) {
        employeeService.updateEmployee(employee);
        return "Employee updated successfully!";
    }

    // Delete an employee by ID
    @DeleteMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable String id) {
        employeeService.deleteEmployeeById(id);
        return "Employee deleted successfully!";
    }
}
