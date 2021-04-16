package assignments.lab_2;

import java.util.Scanner;

public class Question_5_restaurantBill {

	public static void main(String[] args) {
//		Question-5
//		Write a program that computes the tax and tip on a restaurant bill. 
//		The program should ask the user to enter the charge for the meal. The tax should be 6.75 percent of the meal charge. 
//		The tip should be 20 percent of the total after adding tax. Display the meal charge, tax amount, tip amount, and total bill on the screen.

		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the charge of the meal: ");
		double charge = scan.nextDouble();

		double tax = 0.0675 * charge;
		double tip = 0.2 * (charge + tax);
		double totalBill = charge + tax + tip;
		System.out.println("The meal charge: " + charge + "\nTax amount: " + tax + "\nTip amount: " + tip
				+ "\nTotal bill: " + totalBill);

	}

}
