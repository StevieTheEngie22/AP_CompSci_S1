/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int c = 1;
		while (c < 37){
		Scanner sc = new Scanner(System.in);
		Cipher cipher = new Cipher();
		System.out.print("Enter a message to encode: ");
        String message = sc.nextLine();
        String encodedMessage = cipher.encode(message);
        System.out.println("Encoded message: " + encodedMessage);

        System.out.print("Enter a key for keyed encoding: ");
        int key = sc.nextInt();
        String keyedEncodedMessage = cipher.keyedEncode(message, key);
        System.out.println("Keyed encoded message: " + keyedEncodedMessage);
        c++;
		}
	}
}
