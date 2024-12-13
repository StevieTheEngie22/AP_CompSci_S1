/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
	Warrior[] warriors = new Warrior[100];
	Wizard[] wizards = new Wizard[100];
	
	
	int warriorNum = 0;
	int wizardNum = 0;
	int leftWarrior = 100;
	int leftWizard = 100;
	
	for (int i = 0; i < 100; i++){
		warriors[i] = new Warrior("Hobbit " + (i+1));
		wizards[i] = new Wizard("Gandolf " + (i+1));
	}
	
	while (leftWarrior > 0 && leftWizard > 0){
		Warrior currentWarrior = warriors[warriorNum];
		Wizard currentWizard = wizards[wizardNum];
		
		if(!currentWizard.isDead()){
			currentWizard.attack(currentWarrior);
		
		
		if(currentWarrior.isDead()){
			System.out.println(currentWarrior.getName() + " is killed.");
			warriorNum++;
			leftWarrior--;
		 }
		}
		
		if(!currentWarrior.isDead()){
			currentWarrior.attack(currentWizard);
		
		
		if(currentWizard.isDead()){
			System.out.println(currentWizard.getName() + " is killed.");
			wizardNum++;
			leftWizard--;
		}
	}
}

	if (leftWarrior == 0){
		System.out.println("The Wizards are Victourious! There are " + leftWizard + " wizards left");
	}
	
	else if (leftWizard == 0){
		System.out.println("The Warriors are Victourious! /n There are " + leftWarrior + " wizards left");
	}
	}
}
