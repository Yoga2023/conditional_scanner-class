package com.mark.statement;

import java.util.Scanner;

public class Student_Marks {

	public static void main(String[] args) {

		Scanner sm = new Scanner(System.in);
		for (int i = 1; i <=7; i++) {
			System.out.println("Enter the mark:");
			int a = sm.nextInt();
			
			if (a >= 90&&a<=100) {
				System.out.println("Grade A");

			} else if (a >= 80&&a<=90) {
				System.out.println("Grade B");

			} else if (a >= 70&&a<=80) {
				System.out.println("Grade C");

			} else if (a >= 60&&a<=70) {
				System.out.println("Grade D");

			} else if (a >= 35 && a <= 60) {
				System.out.println("Grade E");

			} else {
				System.out.println("Fail");

			}
		}
	}
}