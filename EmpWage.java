package com.bl.employeeWage;

import java.util.Random;

public class EmpWage {
    public static final int partTime = 1;
    public static final int fullTime = 2;

    private   String Company;
    private int RatePerHr;
    private int workingHrs;
    int totalEmpWage;
    private int WorkingDays;

    public EmpWage (String Company, int RatePerHr, int workingHrs,int WorkingDays) {

        this.Company = Company;
        this.RatePerHr = RatePerHr;
        this.workingHrs = workingHrs;
        this.WorkingDays = WorkingDays;
    }
    public void computeWage(){
        int empHrs = 0;
        int empWage = 0;
        int totalEmpWage = 0;
        int totalEmpHrs = 0;
        int day = 0;
        while (totalEmpHrs <= workingHrs && day < WorkingDays) {
            double random = Math.floor(Math.random() * 10) %3;
            switch ((int) random) {
                case partTime:
                    empHrs = 4;
                    break;
                case fullTime:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            empWage = empHrs * RatePerHr;
            totalEmpWage = totalEmpWage + empWage;
            totalEmpHrs = totalEmpHrs + empHrs;
            day++;
        }
        System.out.println("Total Number Of Hours: " + totalEmpHrs);
        System.out.println("Total Employee Wage: " + totalEmpWage);
    }
    public String toString() {
        return "Total Emp Wage for Company: " +Company + " is: " + totalEmpWage;
    }
    public static void main(String[] args) {
        System.out.println("Employee Wage of 1st Company");
        EmpWage e1 = new EmpWage("Airtel", 20, 2, 10);

        System.out.println("Employee Wage of 2nd Company");
        EmpWage e2 = new EmpWage("Jio", 10, 3,20);

        e1.computeWage();
        System.out.println(e1);
        e2.computeWage();
        System.out.println(e2);
    }
}
