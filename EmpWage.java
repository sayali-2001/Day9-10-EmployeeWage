package com.bl.employeeWage;

import java.util.Random;

public class EmpWage {
    int fullTime = 1;

    public void empcheck(){
        Random rd = new Random();
        int present = rd.nextInt(2);
        if(present == fullTime){
            System.out.println("Employee is Present");
        }
        else{
            System.out.println("Employee is Absent");
        }
    }
    public static void main(String[] args) {
        EmpWage obj = new EmpWage();
        obj.empcheck();
    }
}
