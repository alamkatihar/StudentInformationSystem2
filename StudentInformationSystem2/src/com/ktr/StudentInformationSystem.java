package com.ktr;

import java.util.Scanner;

public class StudentInformationSystem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("========================================");
		System.out.println("      STUDENT INFORMATION SYSTEM");
		System.out.println("========================================");

		System.out.print("Enter Student Name : ");
		String name = sc.nextLine();

		System.out.print("Enter Roll Number : ");
		int roll = sc.nextInt();

		System.out.print("Enter Age : ");
		int age = sc.nextInt();

		System.out.print("Enter Java Marks : ");
		double java = sc.nextDouble();

		System.out.print("Enter MySQL Marks : ");
		double mysql = sc.nextDouble();

		System.out.print("Enter HTML Marks : ");
		double html = sc.nextDouble();

		System.out.print("Enter CSS Marks : ");
		double css = sc.nextDouble();

		System.out.print("Enter JavaScript Marks : ");
		double js = sc.nextDouble();

		double total = java + mysql + html + css + js;
		double percentage = total / 5;

		String grade;

		if (percentage >= 90) {
			grade = "A+";
		} else if (percentage >= 80) {
			grade = "A";
		} else if (percentage >= 70) {
			grade = "B";
		} else if (percentage >= 60) {
			grade = "C";
		} else if (percentage >= 50) {
			grade = "D";
		} else {
			grade = "Fail";
		}

		System.out.println();
		System.out.println("========================================");
		System.out.println("         STUDENT REPORT CARD");
		System.out.println("========================================");

		System.out.println("Student Name      : " + name);
		System.out.println("Roll Number       : " + roll);
		System.out.println("Age               : " + age);

		System.out.println("----------------------------------------");

		System.out.println("Java              : " + java);
		System.out.println("MySQL             : " + mysql);
		System.out.println("HTML              : " + html);
		System.out.println("CSS               : " + css);
		System.out.println("JavaScript        : " + js);

		System.out.println("----------------------------------------");

		System.out.println("Total Marks       : " + total);
		System.out.println("Percentage        : " + percentage);
		System.out.println("Grade             : " + grade);

		System.out.println("----------------------------------------");

		if (grade.equals("Fail")) {
			System.out.println("Result            : Better Luck Next Time");
		} else {
			System.out.println("Result            : Congratulations! You Passed");
		}

		System.out.println("========================================");
		System.out.println("Thank You");
		System.out.println("========================================");

		sc.close();
	}
}
