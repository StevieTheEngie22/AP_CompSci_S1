/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input an integer:");
		int num1 = sc.nextInt();
		System.out.println("Anotha one:");
		int num2 = sc.nextInt();
		
		if(num1%2==1){
		  System.out.println("The first number is odd");
		}
		  
		else{
		  System.out.println("The first number is even");                  //num1 even or odd
		}
		
		if(num2%2==1){
		  System.out.println("The second number is odd");
		}
		
		else{
		  System.out.println("The second number is even");                 //num2 even or odd
		}
		
		
		if (num1%3 == 0){
		System.out.println("The first number is divisble by 3");             //num1 divisible
		}
		
		else if (num1%4 == 0){
		System.out.println("The first number is divisble by 4");
		}
		
		else if (num1%5 == 0){
		System.out.println("The first number is divisble by 5");
		}
		
		else{
		System.out.println("The first number is not divisible by three, four, or five");
		}
		
		if (num2%3 == 0){
		System.out.println("The second number is divisble by 3");                      //num2 divisible
		}
		
		else if (num2%4 == 0){
		System.out.println("The second number is divisble by 4");
		}
		
		else if (num2%5 == 0){
		System.out.println("The second number is divisble by 5");
		}
		
		else{
		System.out.println("The second number is not divisible by three, four, or five");
		}
		
		
		
	}
}
