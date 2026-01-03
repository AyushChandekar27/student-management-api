package com.example.studentmanagementapi.service;
import com.example.studentmanagementapi.entity.Student;
import java.util.List;

public interface StudentService{

            List<Student> getAllStudents();
            Student createStudent(Student student);

}