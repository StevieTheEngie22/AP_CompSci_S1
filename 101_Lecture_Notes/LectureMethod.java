/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
        printAnimal();
        greeting("Hopar");
        double newSalary = raise(100000.62, 3);
        System.out.println(newSalary);
        newSalary =  raise(newSalary), 6);
        System.out.println(newSalary);
	}
 
	
	public static void greeting(String name){
	    System.out.println("Barev" + name);
	}
	
	public static void printAnimal(){
	System.out.println("   \\\\_//");
	System.out.println(" __/\".");
	System.out.println("/__ |");
	System.out.println("|| ||");
	}
	
	private static double raise(double salary, int percent){
	    double amount = salary + (salary * (percent/100.0));
	    return amount;
	}
}
}