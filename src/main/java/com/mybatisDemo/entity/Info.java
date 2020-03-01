package com.mybatisDemo.entity;


import java.io.Serializable;

public class Info implements Serializable {
    private Integer id;
    private String smsType;
    private String smsActionType;
    private String phone;
    private String param;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSmsType() {
        return smsType;
    }

    public void setSmsType(String smsType) {
        this.smsType = smsType;
    }

    public String getSmsActionType() {
        return smsActionType;
    }

    public void setSmsActionType(String smsActionType) {
        this.smsActionType = smsActionType;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public Info(Integer id, String smsType, String smsActionType, String phone, String param) {
        this.id = id;
        this.smsType = smsType;
        this.smsActionType = smsActionType;
        this.phone = phone;
        this.param = param;
    }

    @Override
    public String toString() {
        return "Info{" +
                "id=" + id +
                ", smsType='" + smsType + '\'' +
                ", smsActionType='" + smsActionType + '\'' +
                ", phone='" + phone + '\'' +
                ", param='" + param + '\'' +
                '}';
    }
}
