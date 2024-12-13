/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int number = (int)(Math.random() * 1001) + 1;
		
		System.out.print("Guess a number between 1 and 1000: "); 
		int guess = sc.nextInt();
		
		if (number == guess)
		   System.out.println("On the money!");
		else if(number > guess)
		   System.out.println("Your number is lower");
		else if(number < guess)
		   System.out.println("Your number is higher");  
		
		
	}
}
