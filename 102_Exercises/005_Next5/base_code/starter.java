/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter a number:");
	int num = sc.nextInt();
	sc.nextLine();
	System.out.println("Here are the next five numbers:");
	System.out.println(num);
	System.out.println(num+1);
	System.out.println(num+2);
	System.out.println(num+3);
	System.out.println(num+4);
	System.out.println(num+5);
	System.out.println("Here are the next five multiples of " + num + ": ");
	System.out.println(num);
	System.out.println(num * 2);
	System.out.println(num * 3);
	System.out.println(num * 4);
	System.out.println(num * 5);
    System.out.println("Here is " + num + " divided by 100!");
    System.out.println(num / 100.0);
    System.out.println("Here is " + num + " divided by 10!");
    System.out.println(num / 10.0);
	}
}
