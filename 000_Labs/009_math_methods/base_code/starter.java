/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Give me a double.");
		double x = sc.nextDouble();
		
		System.out.println("Give me another double.");
		double y = sc.nextDouble();
		
		System.out.println("The max of these doubles are: " + Math.max(x,y));
		
		System.out.println("The square root of the second double is: " + Math.sqrt(y));
		
		System.out.println("The 1st double to the power of the second double is: " + Math.pow(x,y));
	}
}
