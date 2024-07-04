package com.spring;

import java.util.Map;

public class Company {
    private String name;
    private String address;
    private String contactInfo;
    private Map<Integer, Employee> employees;

    public Company() {}

    public Company(String name, String address, String contactInfo, Map<Integer, Employee> employees) {
        this.name = name;
        this.address = address;
        this.contactInfo = contactInfo;
        this.employees = employees;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
    public Map<Integer, Employee> getEmployees() {
        return employees;
    }
    public void setEmployees(Map<Integer, Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contactInfo='" + contactInfo + '\'' +
                ", employees=" + employees +
                '}';
    }
}
