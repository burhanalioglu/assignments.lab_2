package assignments.lab_2;

import java.util.Scanner;

public class Question_1_LargestAndSmallestNumber {

	public static void main(String[] args) {
//		Write a program with a loop that lets the user enter a series of integer numbers. 
//		After all the numbers have been entered, the program should display the largest and smallest numbers entered.

		Scanner scan = new Scanner(System.in);
		int largestNum = 0;
		int smallestNum = 0;
		int temp = 0;

		System.out.print("Enter your first number:");
		largestNum = scan.nextInt();

		System.out.print("Enter your next number:");
		temp = scan.nextInt();
		if (temp > largestNum) {
			smallestNum = largestNum;
			largestNum = temp;
		} else {
			smallestNum = temp;
		}

		int enterOrStop;
		do {
			System.out.print("Do you want to enter another number: 0-No, 1-Yes");
			enterOrStop = scan.nextInt();
			if (enterOrStop == 1) {
				System.out.print("Enter your test number:");
				temp = scan.nextInt();
				if (temp > largestNum) {
					largestNum = temp;
				} else if (temp < smallestNum) {
					smallestNum = temp;
				}
			}
		} while (enterOrStop == 1);

		System.out.println("Smallest Number is: " + smallestNum);
		System.out.println("Largest Number is: " + largestNum);

	}
}
