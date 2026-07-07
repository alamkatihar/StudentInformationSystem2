package com.ktr2;

import java.util.Scanner;

public class EmployeeSalaryCalculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("======================================");
		System.out.println("      EMPLOYEE SALARY CALCULATOR");
		System.out.println("======================================");

		System.out.print("Enter Employee ID : ");
		int empId = sc.nextInt();

		sc.nextLine();

		System.out.print("Enter Employee Name : ");
		String name = sc.nextLine();

		System.out.print("Enter Basic Salary : ");
		double basic = sc.nextDouble();

		double hra = basic * 0.20;
		double da = basic * 0.10;
		double ta = basic * 0.08;
		double pf = basic * 0.12;

		double grossSalary = basic + hra + da + ta;
		double netSalary = grossSalary - pf;

		System.out.println();
		System.out.println("======================================");
		System.out.println("          SALARY SLIP");
		System.out.println("======================================");

		System.out.println("Employee ID      : " + empId);
		System.out.println("Employee Name    : " + name);

		System.out.println("--------------------------------------");

		System.out.println("Basic Salary     : " + basic);
		System.out.println("HRA (20%)        : " + hra);
		System.out.println("DA (10%)         : " + da);
		System.out.println("TA (8%)          : " + ta);
		System.out.println("PF (12%)         : " + pf);

		System.out.println("--------------------------------------");

		System.out.println("Gross Salary     : " + grossSalary);
		System.out.println("Net Salary       : " + netSalary);

		System.out.println("======================================");
		System.out.println("Thank You");
		System.out.println("======================================");

		sc.close();
	}
}
