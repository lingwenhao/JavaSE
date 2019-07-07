package com.dragonsoft.beanutils.entity;

import java.util.Date;

/**
 * @author ronin
 * @version V1.0
 * @description
 * @class Person
 * @date 2019/6/20 15:02
 */
public class Person {

    private String userName;
    private String password;
    private Date hireDate;

    public Person() {

    }

    public Person(String userName, String password, Date hireDate) {
        this.userName = userName;
        this.password = password;
        this.hireDate = hireDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", hireDate='" + hireDate + '\'' +
                '}';
    }
}
