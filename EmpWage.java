package com.bl.employeeWage;

import java.util.Random;

public class EmpWage {
    public static final int partTime = 1;
    public static final int fullTime = 2;
    int emp_rate_per_hr = 20;
    int workingDays = 20;
    int empHrs = 0;
    int empWage = 0;
    int totalEmpWage = 0;

    public void empcheck() {
        for (int day = 1; day <= workingDays; day++) {
            Random rd = new Random();
            int a = rd.nextInt(3);
            switch (a) {
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
            System.out.println("Day "+day+ " Daily Employee Wage : " +empWage);
            totalEmpWage = totalEmpWage + empWage;
        }
        System.out.println("Total Employee Wage : " +totalEmpWage );
    }
    public static void main(String[] args) {
        EmpWage obj = new EmpWage();
        obj.empcheck();
    }
}
