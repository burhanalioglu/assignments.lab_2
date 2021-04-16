package assignments.lab_2;

import java.util.Scanner;

public class Question_6_purchaseAfterTax {

	public static void main(String[] args) {
//		Question-6
//		Write a program that will ask the user to enter the amount of a purchase. 
//		The program should then compute the state and county tax sales tax. 
//		Assume the state sales tax is 4 percent and the county sales tax is 2 percent. 
//		The program should display the amount of the purchase , the state sales tax, the county sales tax, 
//		the total sales tax, and the total of the sale (which is the sum of the amount of purchase plus the total sales tax)

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter amount of your purchase: ");
		double amountOfPurchase = scan.nextDouble();
		double stateTax = amountOfPurchase * 0.04;
		double countyTax = amountOfPurchase * 0.02;
		double totalSalesTax = stateTax + countyTax;
		double totalOfSale = amountOfPurchase + totalSalesTax;
		System.out.println("The amount of purchase: " + amountOfPurchase + "\nThe state sales tax: " + stateTax
				+ "\nThe county sales tax: " + countyTax + "\nThe total sales tax: " + totalSalesTax
				+ "\nThe total of sales: " + totalOfSale);

	}

}
