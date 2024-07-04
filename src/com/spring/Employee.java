package com.spring;

import java.util.List;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private Account account;
    private List<String> nameOfMobile;
    public Employee(int id, String name, double salary, Account account, List<String> nameOfMobile) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.account = account;
        this.nameOfMobile = nameOfMobile;
    }

    public Employee() {}

    public List<String> getNameOfMobile() {
        return nameOfMobile;
    }

    public void setNameOfMobile(List<String> nameOfMobile) {
        this.nameOfMobile = nameOfMobile;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Account getAccount() {
        return account;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", account=" + account +
                '}';
    }
}
