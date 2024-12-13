/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String[] args) {
	    int x;
	    int sum = 0;
	    double average = 0.0;
	    int min = Integer.MAX_VALUE;
	    int max = Integer.MIN_VALUE;
        int size = (int)(Math.random()*150 + 50);
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = (int)(Math.random()*100 + 1);
        }

        for(int i = 0; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        
        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
            
        }
        
        for(int i = 0; i < array.length; i++){
             sum = sum + array[i];
             average = sum / size;
        }
        

        System.out.println("Array Size: " + size);
        System.out.println("Minimum Value: " + min);
        System.out.println("Maximum Value: " + max);
        System.out.println("Average Value: " + average);
    }
}
