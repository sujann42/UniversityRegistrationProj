package com.stud_reg;

import java.util.Scanner;

public class StudentDatabaseMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Ask how many students will be entered
		System.out.println("Enter a number of students you will enroll: ");
		int noOfStudents = sc.nextInt();

		// Create a number of students
		Student[] students = new Student[noOfStudents];
		
		for(int n=0; n<noOfStudents; n++) {
			students[n] =  new Student();
			students[n].enroll();
			students[n].payTuition();
			
			
		}
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i].showInfo() );
		}
		
	}

}