
/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		int money = 100;
		int num1 = (int)(Math.random()*11);
		int num2 = (int)(Math.random()*11);
		int num3 = (int)(Math.random()*11);
		
		while(money > 1){
	    
	    System.out.println("You have " + money + " dollars, would you like to play the slot machine?");
	    	Scanner sc = new Scanner(System.in);
	    		String game = sc.nextLine();
	    		if (game.equalsIgnoreCase("yes") || game.equalsIgnoreCase("y")) {
	    		System.out.println("How much would you like to wager?");
			Scanner sc2 = new Scanner(System.in);
	    		int wager = sc2.nextInt();
	    		if(wager > money){
	    			System.out.println("Your wager is too high! Try again.");
	    			wager = sc2.nextInt();
	    		}
	    		
	    	System.out.println("|" + num1 + "|" + num2 + "|" + num3 + "|");
	    if(num1 == num2 && num2 == num3){
	    money = money + wager + wager;
	    System.out.println("Jackpot! You now have $" + money);
	    }
	    else if(num1 == num2 || num1 == num3 || num2 == num3){
	    money = money + wager;
	    System.out.println("Your total money is up to $" + money);
	    }
	    else{
	    	money = money - wager;
	    System.out.println("Tough luck, you have $" + money + " remaining.");
	    
	    if(money <= 0){
	    	System.out.println("You bet too much, its time to quit gambling bub.");
	    }
	    
	    num1 = (int)(Math.random()*11);
		num2 = (int)(Math.random()*11);
		num3 = (int)(Math.random()*11);
	    }
	    	
	    }
	   else if (game.equalsIgnoreCase("no") || game.equalsIgnoreCase("n")) {
	    	System.out.println("Thanks for playing! You ended with $" + money);
	    	break;
	    }
	    
		}
	}
}
 