package com.wbg.springdemo.dao;

import com.wbg.springdemo.entity.Student;

public interface StudentDao {
     /**
      * 添加学生
      * @param student
      * @return
      */
     Student saveStudent(Student student);

     Student getStudent();
}
