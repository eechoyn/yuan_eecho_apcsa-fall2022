//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		//add test cases	
		int x1, x2, y1, y2; 
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter X1 :: ");
		x1 = keyboard.nextInt();
		System.out.print("Enter Y1 :: ");
		y1 = keyboard.nextInt();
		System.out.print("Enter X2 :: ");
		x2 = keyboard.nextInt();
		System.out.print("Enter Y2 :: ");
		y2 = keyboard.nextInt();
		
		Distance test = new Distance(x1, y1, x2, y2); 
		test.calcDistance();
		test.getDistance();
		test.print(); 
//		System.out.println(test.toString()); 
		
	}
}