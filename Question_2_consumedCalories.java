package assignments.lab_2;

import java.util.Scanner;

public class Question_2_consumedCalories {

	public static void main(String[] args) {
//		Question-2
//		A bag of cookies holds 40 cookies. 
//		The calorie information on the bag claims that there are 10 serving in the bag and that a serving equals 300 calories. 
//		write a program that lets the user enter the number of cookies he or she actually ate 
//		and then reports the number of total calories consumed.
		int caloriePerCookie = 75;
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Please enter the number of cookies you ate: ");
		int numOfCookies = scan.nextInt();
		int totalCalorie = numOfCookies * caloriePerCookie;
		System.out.println("Total calories you consumed is " + totalCalorie);
		
	}

}
