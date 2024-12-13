package pkg;

public class CVMath {		
	public static int findMid(int one, int two, int three)
	{
		return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	}
	
	public static boolean checkSquare(double num){
		double a;
		double b;
		boolean x;
		int y;
		
		a = Math.sqrt(num);
		y = (int)(Math.sqrt(num));
		
		if (a == y){
			return true;
		}
		else
			return false;
	}
	
	public static boolean add(double num){
		double num2 = num;
		for (int i = 0; num2 > 0; i++){
			num2 = num2 - i;
		}
		
		if (num2 == 0){
			return true;
		}
		
		else
		return false;
	}
	
	public static void findSpecialSquares(int n){
		int c;
		c = 0;
		int holder;
		holder = 1;
		while (c < n){
			if(add(holder) && checkSquare(holder)){
				System.out.println(holder);
				c++;
			}
			holder++;
		}
	}
}
