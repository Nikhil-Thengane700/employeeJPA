package com.bootcoding.studentJPA.service;

import com.bootcoding.employeeJPA.model.Employee;
import com.bootcoding.studentJPA.model.Student;
import com.bootcoding.studentJPA.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentRepo studentRepo;

    public Student insertStudent(Student student) {
        return studentRepo.save(student);
    }

    public List<Student> getAllStudent() {
        return studentRepo.findAll();
    }


    public Optional<Student> getStudentById(int id) {
        return studentRepo.findById(id);
    }

    public void deleteStudentById(int id) {
        studentRepo.deleteById(id);
    }
}
