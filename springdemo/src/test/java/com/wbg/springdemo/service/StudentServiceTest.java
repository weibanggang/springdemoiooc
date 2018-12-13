package com.wbg.springdemo.service;

import com.wbg.springdemo.entity.Student;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentServiceTest {

    @org.junit.Test
    public void saveStudent() {
        StudentService studentService=new StudentService();
        studentService.saveStudent(new Student("韦邦杠",20,"男"));
    }
}