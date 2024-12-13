import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	    
	    int loop = 1;
	    int counter = 0;
	    int timesRun = 9;
	    
while (counter < timesRun) {
		int power = (int)(Math.random() * 75) + 25;
		int contact = (int)(Math.random() * 60) + 40;
		int speed = (int)(Math.random() * 75) + 25;
		int defense = (int)(Math.random() * 75) + 25;
		
		int position = (int)(Math.random() * 8) + 1;
		int age = (int)(Math.random() * 7) + 18;
		
		System.out.print(age + " ");      //Prints out player's age
	
		if(position == 1)                 //Prints out player's position
		System.out.println("1B");
		 else if(position == 2)
		  System.out.println("2B");
		   else if(position == 3)
		   System.out.println("3B");
		    else if(position == 4)
		    System.out.println("SS");
		     else if(position == 5)
		     System.out.println("LF");
		      else if(position == 6)
		      System.out.println("CF");
		       else if(position == 7)
		       System.out.println("RF");
		        else if(position == 8)
		        System.out.println("C");
		  
		
		String rating = new String ("Pow:" + power + " Con:" + contact + " Spd:" + speed + " Def:" + defense);
		System.out.println(rating);
		
		Scanner sc = new Scanner(System.in);
		int player = sc.nextInt();
		if(player = 1){
			
			int counter = 9;
		}
		
		counter++;
		
		
		

           }
        

    }     
}
