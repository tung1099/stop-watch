package com.company;

public class StopWatch {
    long startTime;
    long endTime;

    public void start(){
        this.startTime = System.currentTimeMillis();
    }
    public void stop(){
        this.endTime = System.currentTimeMillis();
    }
    public long getElapseTime(){
        long result = this.endTime - this.startTime;
        return result;
    }
}
