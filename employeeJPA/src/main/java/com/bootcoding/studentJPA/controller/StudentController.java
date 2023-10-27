package com.bootcoding.studentJPA.controller;

import com.bootcoding.employeeJPA.model.Employee;
import com.bootcoding.studentJPA.model.Student;
import com.bootcoding.studentJPA.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api2")
public class StudentController {
    @Autowired
    StudentService studentService;


    @PostMapping("/student")
    public Student insertStudent(@RequestBody Student student){
        return studentService.insertStudent(student);
    }

    @GetMapping("/student")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();

    }

    @GetMapping("/student/{id}")
    public Optional<Student> getStudentById(@PathVariable int id){
        return studentService.getStudentById(id);
    }

    @DeleteMapping("/student/{id}")
    public void deleteStudentById(@PathVariable int id){
        studentService.deleteStudentById(id);
    }

}
