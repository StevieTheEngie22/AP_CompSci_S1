/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Dog firstDog = new Dog("Shaun Livingston");
        firstDog.setAge(5);

        Dog secondDog = new Dog("Lemon", "Lime");

        if (firstDog.isSleeping()) {
            System.out.println(firstDog.getName() + " is asleep.");
        } else {
            firstDog.bark();
            if (!secondDog.isSleeping()) {
                secondDog.bark();
            }
        }
    }
}
