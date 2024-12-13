/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("What day of the week is it?");
		String day = sc.nextLine();
		
		if (day.equalsIgnoreCase("Sunday") || day.equalsIgnoreCase("Saturday")) {
			
			System.out.println("Wake up! It is 10:00am.");
		}
		
		else
		System.out.println("Wake up! It is 7:00am.");
		
	
	}
}
