/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
	   
       int arr[] = new int[20];
       int numDups = 0;
       for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*10 + 1);
        }
       
       for (int i = 0; i < arr.length; i++){
       System.out.println(arr[i]);
       }
       
       int num = (int)(Math.random()*10 + 1);
       System.out.println("number equals " + num);
       
       for(int i = 0; i < arr.length; i++){
       	if(num == arr[i]){
       		numDups++;
       		System.out.println("There is a duplicate at index #: " + i);
       		System.out.println("There are " + numDups + " duplicates");
       		System.out.println("");
       	}
	}
	
		for(int i = 1; i < arr.length; i++)
		if(arr[i] == arr[i-1]){
			System.out.println("index " + i + " and " + (i-1) + " are cosecutive duplicates of " + arr[i]);
		}
}
}
