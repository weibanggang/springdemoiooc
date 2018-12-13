package com.wbg.springdemo.service;

import com.wbg.springdemo.dao.StudentDao;
import com.wbg.springdemo.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 实现业务
 */
public class StudentService {

    StudentDao studentDao;
    //构造器实现
    public StudentService(){
        //容器
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("IOCStudentBean.xml");
        //从容器中获取studentDao的bean
        studentDao= (StudentDao) applicationContext.getBean("studentDao");
        //从容器中获取studentProperty的bean
        Student studentProperty= (Student) applicationContext.getBean("studentProperty");
        //studentConstructor
        Student studentConstructor= applicationContext.getBean("studentConstructor",Student.class);
        System.out.println(studentProperty);
        System.out.println(studentConstructor);
    }

    /**
     * 添加学生方法
     * @param student 给一个学生对象
     */
    public void saveStudent(Student student){
        System.out.println("开始添加学生");
        Student std=studentDao.saveStudent(student);
        System.out.println(std);
    }
}
