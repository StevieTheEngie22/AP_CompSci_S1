/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word = sc.nextLine();
		
		
		for (int i = 0; i < word.length(); i++) {
		String letter = word.substring(i, i + 1);
		System.out.println(letter);	
		}
		
		
		BaseClass test = new BaseClass();


		
	}
}
