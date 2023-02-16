package com.bl.employeeWage;

import java.util.Random;

public class EmpWage {

    int fullTime = 1;
    int emp_rate_per_hr = 20;
    int empHrs = 0;
    int empWage = 0;

    public void empcheck(){
        Random rd = new Random();
        int present = rd.nextInt(2);
        if(present == fullTime){
            empHrs = 8;
        }
        else{
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
