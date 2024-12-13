/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		\
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
       System.out.println("What is your name?");
       String name = sc.nextLine();
       
       System.out.println("How many times should it print?");
       int print = sc.nextInt();
       
       while(count < print){
           System.out.println(name);
           count++;
       }
       
	}
}
