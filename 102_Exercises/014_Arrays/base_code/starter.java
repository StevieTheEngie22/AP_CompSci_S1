/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int [] i = new int[1001];
		 int c = 0;
		 int num = 0;
		 while(c<1001){
	
		 	i[c] = 3 + num;																																																																
		 	System.out.println(i[c]);
		 	num = num + 3;
		 	c++;
		 }
		 int [] z = new int[1001];
		 int c2 = 0;
		 int num2 = 0;
		 while(c2 < 1001){
		 	z[c2] = 1001 - num2;
		 	System.out.println(z[c2]);	
		 	num2++;
		 	c2++;
		 }
	}
}
