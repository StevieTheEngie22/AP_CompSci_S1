/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Type an integer: ");
		int int1 = sc.nextInt();
		System.out.print("Type another integer: ");
		int int2 = sc.nextInt();
		System.out.print("Type one more integer: ");
		int int3 = sc.nextInt();
		
		if((int1 > int2) && (int1 > int3)){
		  System.out.println(int1 + " is the largest integer!");
		}
		  if((int2 > int1) && (int2 > int3)){
		    System.out.println(int2+ " is the largest integer!");
		  }
		    if((int3 > int1) && (int3 > int2)){
		      System.out.println(int3+ " is the largest integer!");
		    }
		    
		    
		if((int1 < int2) && (int1 < int3)){
		  System.out.println(int1 + " is the smallest integer!");
		}
		  if((int2 < int1) && (int2 < int3)){
		    System.out.println(int2+ " is the smallest integer!");
		  }
		    if((int3 < int1) && (int3 < int2)){
		      System.out.println(int3+ " is the smalles integer!");
		    }    
	    
	}
}
