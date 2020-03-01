package com.mybatisDemo.entity;

public class User {

    private String name;    //姓名
    private Integer age;    //年龄
    private String gender;  //性别
    private String motto;   //座右铭

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }

    public User(String name, Integer age, String gender, String motto) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.motto = motto;
    }

    @Override
    public String toString() {
        return age + "岁" + gender + "人[" + name + "]的座右铭是:" + motto + "!!!";
    }
}