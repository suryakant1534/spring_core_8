package com.example;

import com.spring.Company;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Example3 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Company company = (Company) applicationContext.getBean("company");
        System.out.println(company.getEmployees().getClass());
        System.out.println(company);
    }
}
