package com.bl.employeeWage;

import java.util.Random;

public class EmpWage {

    int partTime = 1;
    int fullTime = 2;
    int emp_rate_per_hr = 20;
    int empHrs = 0;
    int empWage = 0;
    public void empcheck(){
        Random rd = new Random();
        int present = rd.nextInt(3);
        if(present == fullTime)
        {
            empHrs = 16;
        } else if(present == partTime)
        {
            empHrs = 8;
        } else{
            empHrs = 0;
        }
        empWage = empHrs * emp_rate_per_hr;
        System.out.println("Daily Employee Wage : "+empWage);
    }

    public static void main(String[] args) {
        EmpWage obj = new EmpWage();
        obj.empcheck();
    }
}
