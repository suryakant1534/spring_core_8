package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private List<BankDetail> bankDetailList;
    private int id;
    private String username;
    private String password;

    private void onInit() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        var bankDetail = (BankDetail) context.getBean("bankDetail");
        bankDetailList = new ArrayList<BankDetail>();
        bankDetailList.add(bankDetail);
    }

    public Account() {}

    public Account(List<BankDetail> bankDetailList, int id, String username, String password) {
        this.bankDetailList = bankDetailList;
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public List<BankDetail> getBankDetailList() {
        return bankDetailList;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setBankDetailList(List<BankDetail> bankDetailList) {
        this.bankDetailList = bankDetailList;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Account{" +
                "bankDetailList=" + bankDetailList +
                ", id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
