package com.bootcoding.employeeJPA.service;

import com.bootcoding.employeeJPA.repo.EmployeeRepo;
import com.bootcoding.employeeJPA.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo employeeRepo;

    public Employee insertEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    public List<Employee> getAllEmployee() {
        return employeeRepo.findAll();
    }

    public Optional<Employee> getEmployeeById(int id) {
        return employeeRepo.findById(id);
    }

    public void deleteEmployeeById(int id){
    employeeRepo.deleteById(id);
    }
}
