package com.payroll;

public class TimeCard {
    private float[] hours = new float[7];
    public void work(int day, float time){
        if (day>=0 && day <7){
            if (time>0 && time<24){
                hours[day]+= time;
            }
        }
    }
}
