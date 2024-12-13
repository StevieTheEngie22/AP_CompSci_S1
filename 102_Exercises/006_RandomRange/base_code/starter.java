/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please input an integer: ");
		 int num1 = sc.nextInt();
		 sc.nextLine();
		System.out.println("Please input a larger integer: ");
		 int num2 = sc.nextInt();
		 sc.nextLine();
		 int x = (int)(Math.random()*(num2 - num1)) + num1;
		 int x2 = (int)(Math.random()*(num2 - num1)) + num1; 
		 int x3 = (int)(Math.random()*(num2 - num1)) + num1;
		 int x4 = (int)(Math.random()*(num2 - num1)) + num1;
		 int x5 = (int)(Math.random()*(num2 - num1)) + num1;
		 
		 System.out.println("Here is 5 numbers in the range: ");
		 
		System.out.println(x);
		System.out.println(x2);
		System.out.println(x3);
		System.out.println(x4);
		System.out.println(x5);
		
		
		
	}
}
