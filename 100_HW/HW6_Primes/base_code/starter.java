/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	
	
	public static boolean checkPrime(int number) {
		int divisor = 2;
		while (divisor < number) {
			if (number % divisor == 0){
				return false;
			}
			divisor++;
		}
		return true;
	}
	
	public static void printPrimes(int max) {
		int current = 2;
		while (current < max) {
            if (checkPrime(current)) {
                System.out.println(current);
            }
            current++;
        }
	}
	
	
	public static void main(String args[]) {
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("Input an integer: ");
		int input = sc.nextInt();
		printPrimes(input);
       
	}
	
}
