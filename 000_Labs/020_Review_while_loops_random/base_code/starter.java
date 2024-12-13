/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Guess the number 1 to a 1000");
		int guess = sc.nextInt();
		int secret = (int)(Math.random() * 1001);
		
		while(guess != secret){
			
	        
	        if(guess > secret){
	        System.out.println("Too high");
	        }
	        if(guess < secret){
	        System.out.println("Too low");
	        }
			else if (guess == secret){
			System.out.println("Correct!");
			break;
			}
			guess = sc.nextInt();

		}
		
		
	}
}
