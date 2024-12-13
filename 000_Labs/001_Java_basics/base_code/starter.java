/*
 *	Author:  
 *  Date: 
*/
import java.util.Random;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		boolean base1 = false;
		boolean base2 = false;
		boolean base3 = false;
		int outs = 0;
		int outcome = (int)(Math.random() * 100);
		
     while(outs < 3){
     	if(outcome > 30){
		System.out.println("Out!");
		outs++;
	    outcome = (int)(Math.random() * 100);
		}
	    else{
	    int hitType = (int)(Math.random() * 100);
	    
			if(hitType >= 98){
		    System.out.println("Triple!");
		    outcome = (int)(Math.random() * 100);
		    base3 = true;
		    }
			    else if((hitType >= 90)  && (hitType < 98)){
			    System.out.println("Home Run!");
			    outcome = (int)(Math.random() * 100);
			    }
				    else if((hitType >= 75) && (hitType < 90)){
				    System.out.println("Double!");
				    if((base1 == true) && (base2 == false) && (base3 = false)){
				    	System.out.println("Runner moves to third.");
				    	base3 = true;
				    }
				    if((base2 == true) && (base1 == false) && (base3 == false)){
				    	System.out.println("Runner scores.");
				    }
				    if((base2 == false) && (base3 == true) && (base1 == false)){
						System.out.println("Runner scores.");
				    }
				    base2 = true;
				    outcome = (int)(Math.random() * 100);
				    }
					    else if(hitType >= 70){
						System.out.println("Walk!");
						outcome = (int)(Math.random() * 100);
						base1 = true;
				 	    }
					 	    else if(hitType < 70){
							System.out.println("Single!");
							if(base1 == true){
				    	    System.out.println("Runner moves to second.");
							}
							base1 = true;
							outcome = (int)(Math.random() * 100);
					 	    }
	 	    
		}
	
		
     }
	}
}
