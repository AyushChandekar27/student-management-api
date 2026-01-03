package com.example.StudentManagementApiApplication.java.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student{

    private String name;
    private int rollNo;
    private String department;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Student(){

    }


    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }



    public int getRollNo(){
        return rollNo;
    }
    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }



    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department = department;
    }


    public Long getId(){
        return id;
    }



}