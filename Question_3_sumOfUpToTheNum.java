package assignments.lab_2;

import java.util.Scanner;

public class Question_3_sumOfUpToTheNum {

	public static void main(String[] args) {
//		Question-3
//		Write a program that asks the user for a positive nonzero integer value. 
//		The program should use a loop to get the sum of all the integers from 1 up to the number entered. 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please write your positive number to add the numbers up to it: ");
		int userNum = scan.nextInt();
		int sumOfNums = 0;
		
		if (userNum > 0) {
			for (int i = 1; i <= userNum; i++) {
				sumOfNums += i;
			}
			System.out.println("The sum of numbers up to yours is: " + sumOfNums);
		} else {
			System.out.println("Invalid number");
		}

	}

}
