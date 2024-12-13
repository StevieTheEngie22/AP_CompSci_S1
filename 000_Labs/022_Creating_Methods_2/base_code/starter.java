/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
    int answer = pow(3,4);
    System.out.println("The answer is = " + answer);
    
   
		
	}
       
    public static int pow(int x, int y) {
        if (y < 0) {
            return 0; 
        }

        int result = 1;
        int count = 0;
        while (count < y) {
            result *= x;
            count++; 
        }

        return result; 
    }
}