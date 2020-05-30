package com.stud_reg;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = "";
	private double tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int ID = 1000;

	Scanner scanner = new Scanner(System.in);

	// Constructor: prompts user to enter name and year
	public Student() {
		System.out.println("Enter First Name: ");
		this.firstName = scanner.nextLine();
		System.out.println("Enter Last Name: ");
		this.lastName = scanner.nextLine();
		System.out.println("1 - Freshmen\n2 - Sophomore\n3 - Juinor\n4 - Senior\n Enter graduation year: ");
		this.gradeYear = scanner.nextInt();
		setStudentID();

		// System.out.printf("Name: %-10s %-12s %4d %6s", this.firstName, this.lastName,
		// this.gradeYear, this.studentID);
		System.out.println("\n___________________________________");

	}

	// Generate an ID
	private void setStudentID() {

		// Grade Level+ID
		this.studentID = this.gradeYear + "" + this.ID;
		// Increment ID by 1
		ID++;

	}

	// Enroll in courses
	public void enroll() {
		do {
			System.out.print("Enter a course to enroll (Q to quit.)");
			Scanner scanner = new Scanner(System.in);
			String course = scanner.nextLine();
			if (!course.equalsIgnoreCase("Q")) {
				courses += "\n   " + course;
				tuitionBalance += costOfCourse;

			} else {
				break;
			}
		} while (1 != 0);

		// System.out.println("Enrolled in: "+courses);
	}

	// View balance
	public void viewBalance() {
		System.out.println("Your balance is: $" + tuitionBalance);
	}

	// Pay tuition
	public void payTuition() {
		viewBalance();
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter amount you want to pay: $");
		int payment = sc.nextInt();
		tuitionBalance -= payment;
		System.out.println("Thank you for your payment of: $" + payment);
		viewBalance();
	}

	// Show Status
	public String showInfo() {
		return "Name: " + firstName + " " + lastName + "\nGrade Level: " + gradeYear + "\nStudent ID: " + studentID
				+ "\nCourses Enrolled: " + courses + "\nBalance: $" + tuitionBalance;
	}

}
