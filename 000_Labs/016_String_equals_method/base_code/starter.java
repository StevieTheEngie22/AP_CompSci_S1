/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to be a Wizard, Warrior, or Rogue?"); 
		String role = sc.nextLine();
		
		if (role.equalsIgnoreCase("rogue"))
			
			System.out.println("You are a " + role + ", spy on the enemy!");
		
		else if (role.equalsIgnoreCase("warrior"))
			
			System.out.println("You are a " + role + ", fight for your country!");
		
	
		else if (role.equalsIgnoreCase("wizard"))
			
			System.out.println("You are a " + role + ", craft the secret potion!" );
			
	    else
	        System.out.println("THAT IS NOT AN OPTION BROTHER!");
	}
} 
