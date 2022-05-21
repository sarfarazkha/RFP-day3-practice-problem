package com.bridgelab;


public class EmployeeWage {
    public EmployeeWage() {
    }

    public static void main(String[] args) {
        int IS_FULL_TIME = 1;
        double empCheck = Math.floor(Math.random() * 10.0) % 2.0;
        if (empCheck == (double)IS_FULL_TIME) {
            System.out.println("Employee is present");
        } else {
            System.out.println("Employee is absent");
        }

    }
}