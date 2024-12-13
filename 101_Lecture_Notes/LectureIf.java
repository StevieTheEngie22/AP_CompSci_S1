/* 
    Lecture note example - If Statements
*/

import java.util.Scanner;

class LectureIf{
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Mr. Poole is in the midst of his journey to create the ultimate code to reverse time!");
        System.out.println("How should he continue");
        System.out.println("1.He develops the complex Quantum Algorithm that utlizes super position");
        System.out.println("2.He summons the risky Temporal Interface that harnesses energy from black holes, in order to create a wormhole into the past");
        System.out.println("3. He explores the idea of altering human genetics to enhance memory and perception, unlocking deep, buried memories");
        
        int answer = sc.nextInt();
        if(answer == 1) {
            System.out.println("Good choice! Now what?");
            System.out.println("1. Simulate a Small Time Jump");
            System.out.println("2. Test on a Personal Memory");
            System.out.println("3. Implement a Feedback Loop");
            
            int answer2 = sc.nextInt();
        }
          else if(answer == 2){
              System.out.println("Good choice! Now what?");
              System.out.println("1. A Controlled Test");
              System.out.println("2. Time Travel to a Historical Event");
              System.out.println("3. Attempt a Personal Journey");
              
              int answer2 = sc.nextInt();
          }
          
            else if(answer == 3){
                System.out.println("Good choice! Now what?");
                System.out.println("1. Develop a Memory Enhancer");
                System.out.println("2. Create a Genetic Modulation Device");
                System.out.println("3. Collaborate with a Geneticist");
                
                int answer2 = sc.nextInt();
            }
            
	}
	
}