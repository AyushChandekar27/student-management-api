package com.example.StudentManagementApiApplication.java.service;

import com.example.StudentManagementApiApplication.java.entity.Student;
import com.example.StudentManagementApiApplication.java.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    @Override
    public Student createStudent(Student student){
        return studentRepository.save(student);
    }

}
