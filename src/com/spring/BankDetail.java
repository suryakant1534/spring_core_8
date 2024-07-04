package com.spring;

public class BankDetail {
    private String bankName;
    private String accountNumber;
    private String accountType;
    private String ifcCode;

    private void onInitialize() {
        bankName = "new bank";
        accountNumber = "new account";
        accountType = "new account type";
        ifcCode = "new ifcCode";
    }

    public BankDetail() {}

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public BankDetail(String bankName, String accountNumber, String ifcCode, String accountType) {
        this.bankName = bankName;
        this.accountNumber = accountNumber;
        this.ifcCode = ifcCode;
        this.accountType = accountType;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setIfcCode(String ifcCode) {
        this.ifcCode = ifcCode;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public String getIfcCode() {
        return ifcCode;
    }

    @Override
    public String toString() {
        return "BankDetail{" +
                "bankName='" + bankName + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", accountType='" + accountType + '\'' +
                ", ifcCode='" + ifcCode + '\'' +
                '}';
    }
}
