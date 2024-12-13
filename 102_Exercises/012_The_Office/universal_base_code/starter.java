/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
			dwight.employeeToString();
		Employee jim = new Employee(2474, "Jim", "Halpert", 4416.66);
			jim.employeeToString();
		Employee pam = new Employee(2011, "Pam", "Beesly", 2250);
			pam.employeeToString();
		Employee shant = new Employee(5493, "Shant", "Shabazian", 15.6);
			shant.employeeToString();
		
		dwight.raiseSalary(12);
			System.out.println(dwight.getAnnualSalary());
		jim.raiseSalary(5);
			System.out.println(jim.getAnnualSalary());
		pam.raiseSalary(4);
			System.out.println(pam.getAnnualSalary());
		shant.raiseSalary(25);
			System.out.println(shant.getAnnualSalary());
		

	}
}
