package com.example.StudentManagementApiApplication.java.service;
import com.example.StudentManagementApiApplication.java.entity.Student;
import java.util.List;

public interface StudentService{

            List<Student> getAllStudents();
            Student createStudent(Student student);

}