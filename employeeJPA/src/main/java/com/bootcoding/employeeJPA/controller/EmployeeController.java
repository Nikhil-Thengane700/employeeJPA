package com.bootcoding.employeeJPA.controller;

import com.bootcoding.employeeJPA.service.EmployeeService;
import com.bootcoding.employeeJPA.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/employee")
    public Employee insertEmployee(@RequestBody Employee employee){
        return employeeService.insertEmployee(employee);
    }

    @GetMapping("/employee")
    public List<Employee> getAllEnployee(){
        return employeeService.getAllEmployee();
    }

    @GetMapping("/employee/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable int id){
        return employeeService.getEmployeeById(id);
    }
    @DeleteMapping("/employee/{id}")
    public void deleteEmployeeById(@PathVariable int id){
        employeeService.deleteEmployeeById(id);
    }
}
