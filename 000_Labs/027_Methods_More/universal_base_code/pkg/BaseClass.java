/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class Character {
    private String role;
    private int strength;
    private int dexterity;
    private int intelligence;
    private int charisma;

    public Character() {
      
        this.role = "None";
        this.strength = 0;
        this.dexterity = 0;
        this.intelligence = 0;
        this.charisma = 0;
    }

    public String setRole(String role) {
        this.role = role; 
        return this.role;
    }

    public int setStrength(int strength) {
        this.strength = Math.max(0, strength);
        return this.strength;
    }

    public int setDexterity(int dexterity) {
        this.dexterity = Math.max(0, dexterity);
        return this.dexterity;
    }

    public int setIntelligence(int intelligence) {
        this.intelligence = Math.max(0, intelligence); 
        return this.intelligence;
    }

    public int setCharisma(int charisma) {
        this.charisma = Math.max(0, charisma);
        return this.charisma;
    }

    public boolean setAll(String role, int strength, int dexterity, int intelligence, int charisma) {
        setRole(role);
        setStrength(strength);
        setDexterity(dexterity);
        setIntelligence(intelligence);
        setCharisma(charisma);
        return true;
    }

    public String myToString() {
        return "Role: " + role +
               "\nStrength: " + strength +
               "\nDexterity: " + dexterity +
               "\nIntelligence: " + intelligence +
               "\nCharisma: " + charisma;
    }
