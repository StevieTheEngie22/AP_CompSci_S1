import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// CVMath.specialSquare(5);
		Scanner sc = new Scanner(System.in);
		System.out.println("# of Magic Squares to Print: ");
		int x = sc.nextInt();
		sc.nextLine();
	    CVMath.findSpecialSquares(x);
	}
}
