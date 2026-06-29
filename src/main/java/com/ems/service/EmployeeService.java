package com.ems.service;

import com.ems.entity.Employee;
import com.ems.exception.EmployeeNotFoundException;
import com.ems.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    // CREATE - Add new employee
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    // READ ALL - Get all employees
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // READ ONE - Get employee by ID
    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException(
                        "No employee found with ID: " + id));
    }

    // UPDATE - Edit employee details
    public Employee updateEmployee(Long id, Employee updatedData) {
        Employee existing = getEmployeeById(id);
        existing.setName(updatedData.getName());
        existing.setDesignation(updatedData.getDesignation());
        existing.setSalary(updatedData.getSalary());
        existing.setAge(updatedData.getAge());
        return employeeRepository.save(existing);
    }

    // DELETE - Remove employee
    public void deleteEmployee(Long id) {
        if (!employeeRepository.existsById(id)) {
            throw new EmployeeNotFoundException(
                    "Cannot delete. No employee found with ID: " + id);
        }
        employeeRepository.deleteById(id);
    }

    // COUNT - Total employees
    public long getTotalCount() {
        return employeeRepository.count();
    }
}
