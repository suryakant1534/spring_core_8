package com.example;

import com.spring.Employee;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Example1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Employee employee = (Employee) applicationContext.getBean("employee");
        System.out.println(employee.getNameOfMobile().getClass());
        System.out.println(employee);
    }
}
