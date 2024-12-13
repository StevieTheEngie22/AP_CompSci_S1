/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
	   Scanner sc = new Scanner (System.in);
	
	System.out.println("Type in an integer: ");
		int num1 = sc.nextInt();
	System.out.println("Type in another integer: ");
	    int num2 = sc.nextInt();
	
	if(num1 != num2) {
	System.out.println("These numbers are different!");
    }
    
    if(num1 == num2) {
    System.out.println("These numbers are equal!");
    }
    	
    	
    
	}
}
