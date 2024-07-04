package com.example;

import com.spring.Company;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Example4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext4.xml");
        Company company = (Company) applicationContext.getBean("company");
        System.out.println(company.getEmployees().getClass());
        System.out.println(company);
    }
}
