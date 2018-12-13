package com.wbg.springdemo.dao;

import com.wbg.springdemo.entity.Student;


//spring使用@Service进行实现
//手动实现<bean id="studentDao" class="com.wbg.springdemo.dao.StudentDaoImp" />
public class StudentDaoImp implements StudentDao {
    public Student saveStudent(Student student) {
        return student;
    }

    @Override
    public Student getStudent() {
        return null;
    }
}