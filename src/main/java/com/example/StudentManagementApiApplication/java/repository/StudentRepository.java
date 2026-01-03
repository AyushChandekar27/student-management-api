package com.example.StudentManagementApiApplication.java.repository;

import com.example.StudentManagementApiApplication.java.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
