/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}
	public static int randAge() {
        return (int)(Math.random() * 100); // Random age between 0 and 99
	}

	public static void main(String args[]) {
		PooleDwarf dwarf1 = new PooleDwarf(randName(), randAge());
        PooleDwarf dwarf2 = new PooleDwarf(randName(), randAge());
        PooleDwarf dwarf3 = new PooleDwarf(randName(), randAge());
        PooleDwarf dwarf4 = new PooleDwarf(randName(), randAge());
        PooleDwarf dwarf5 = new PooleDwarf(randName(), randAge());
        PooleDwarf dwarf6 = new PooleDwarf(randName(), randAge());
        PooleDwarf dwarf7 = new PooleDwarf(randName(), randAge());

        String firstDwarfName = dwarf1.getName();
        
        int duplicateCount = 0;

        if(dwarf1.getName() == dwarf2.getName()){
            System.out.println("Dwarf 1 and dwarf 2 have the same name: " + dwarf1.getName());
            duplicateCount++;
        }
        if(dwarf1.getName() == dwarf3.getName()){
            System.out.println("Dwarf 1 and dwarf 3 have the same name: " + dwarf1.getName());
            duplicateCount++;
        }
        if(dwarf1.getName() == dwarf4.getName()){
            System.out.println("Dwarf 1 and dwarf 4 have the same name: " + dwarf1.getName());
            duplicateCount++;
        }
        if(dwarf1.getName() == dwarf5.getName()){
            System.out.println("Dwarf 1 and dwarf 5 have the same name: " + dwarf1.getName());
            duplicateCount++;
        }
        if(dwarf1.getName() == dwarf6.getName()){
            System.out.println("Dwarf 1 and dwarf 6 have the same name: " + dwarf1.getName());
            duplicateCount++;
        }
        if(dwarf1.getName() == dwarf7.getName()){
            System.out.println("Dwarf 1 and dwarf 7 have the same name: " + dwarf1.getName());
            duplicateCount++;
        }
        System.out.println("Dups:" + duplicateCount);
	}
}
