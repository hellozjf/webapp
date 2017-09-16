package com.hellozjf.webapp.domain;

import java.util.Date;

public class LogInfo {

    private Date logTime;
    private int id;
    private int isSuccess;
    
    public Date getLogTime() {
        return logTime;
    }
    public void setLogTime(Date logTime) {
        this.logTime = logTime;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getIsSuccess() {
        return isSuccess;
    }
    public void setIsSuccess(int isSuccess) {
        this.isSuccess = isSuccess;
    }
}
