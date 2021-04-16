package assignments.lab_2;

import java.util.Scanner;

public class Question_4_percentOfMaleAndFemale {

	public static void main(String[] args) {
//		Question-4
//		Write a program that asks user for the number of males and the number of females registered in a class. 
//		The program should display the percentage of males and females in the class.

		Scanner scan = new Scanner(System.in);
		System.out.print("Please write number of Males: ");
		int numOfMales = scan.nextInt();
		System.out.print("Please write number of Females: ");
		int numOfFemales = scan.nextInt();
		
		int sumOfClass = numOfFemales + numOfMales;
		double percentOfMales = ((double) numOfMales / sumOfClass) * 100;
		double percentOfFemales = ((double) numOfFemales / sumOfClass) * 100;
		
		System.out.println("The number of males: " + numOfMales + "\nthe number of females: " + numOfFemales
				+ "\nClass total: " + sumOfClass);
		System.out.println(
				"Percent of the males is: " + percentOfMales + " and percent of the females is: " + percentOfFemales);

	}

}
