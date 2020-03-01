package com.mybatisDemo.entity;

import java.io.Serializable;
import java.util.Date;

public class CallbackInfo implements Serializable {
    private Integer id;
    private String mabile;
    private String smsType;
    private Date report_time;
    private String errmsg;
    private String description;
    private String sid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMabile() {
        return mabile;
    }

    public void setMabile(String mabile) {
        this.mabile = mabile;
    }

    public String getSmsType() {
        return smsType;
    }

    public void setSmsType(String smsType) {
        this.smsType = smsType;
    }

    public Date getReport_time() {
        return report_time;
    }

    public void setReport_time(Date report_time) {
        this.report_time = report_time;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }
}
