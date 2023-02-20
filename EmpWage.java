package com.bl.employeeWage;

import java.util.Random;

public class EmpWage {

    public  static final int partTime = 1;
    public  static final int fullTime = 2;
    int emp_rate_per_hr = 20;
    int empHrs = 0;
    int empWage = 0;

    public void empcheck(){
        Random rd = new Random();
        int a = rd.nextInt(3);

        switch (a){
            case partTime:
                empHrs = 4;
                break;
            case fullTime:
                empHrs = 8;
                break;
            default:
                System.out.println("wrong input");
        }
        empWage = empHrs * emp_rate_per_hr;
        System.out.println("Daily Employee Wage : "+empWage);
    }
    public static void main(String[] args) {
        EmpWage obj = new EmpWage();
        obj.empcheck();
    }
}
