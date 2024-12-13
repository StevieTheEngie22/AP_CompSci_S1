/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int points = 20;
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
	
	   System.out.println("20 points are available, how many do you want to spend on strength?");
	   int strPoints = sc.nextInt();
	   if(strPoints > points){
	      System.out.println("Input is too high");
			System.out.println("Input a new number:");
			strPoints = sc.nextInt();
	   }
	   points = points - strPoints;
	   
	   System.out.println("You have " + points + " points remaining, how many do you want to spend on dexterity?");
	   int dxtPoints = sc.nextInt();
	   if(dxtPoints > points){
	      System.out.println("Input is too high");
	      System.out.println("Input a new number:");
		    dxtPoints = sc.nextInt();
	   }
	   points = points - dxtPoints;
	   
	   System.out.println("You have " + points + " points remaining, how many do you want to spend on intelligence?");
	   int intPoints = sc.nextInt();
	   if(intPoints > points){
	      System.out.println("Input is too high");
	      System.out.println("Input a new number:");
			intPoints = sc.nextInt();
	   }
	   points = points - intPoints;
	   
	   System.out.println("You have " + points + " points remaining, how many do you want to spend on charisma?");
	   int chrPoints = sc.nextInt();
	   if(chrPoints > points){
	      System.out.println("Input is too high");
	      System.out.println("Input a new number:");
			chrPoints = sc.nextInt();
	   }
	   	   points = points - chrPoints;


     System.out.println("You are a " + role);
     System.out.println("Strentgh:" + strPoints);
	 System.out.println("Dexterity:" + dxtPoints);
	 System.out.println("Intelligence:" + intPoints);
	 System.out.println("Charisma:" + chrPoints);
		
		}
}
