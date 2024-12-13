/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;


public class Character{
	String role;
	int strength;
    int dexterity;
    int intelligence;
    int charisma;


public Charachter(String role, int strength, int dexterity, int intelligence, int charisma){
	    this.role = role;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.charisma = charisma;
}
    public String getRole() {
        return role;
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getCharisma() {
        return charisma;
    }

	public static void main(String args[]) {
		Character character = new Character("Wizard", 10, 8, 15, 12);
        System.out.println("Role: " + character.getRole());
        System.out.println("Strength: " + character.getStrength());
        System.out.println("Dexterity: " + character.getDexterity());
        System.out.println("Intelligence: " + character.getIntelligence());
        System.out.println("Charisma: " + character.getCharisma());

	}
}
