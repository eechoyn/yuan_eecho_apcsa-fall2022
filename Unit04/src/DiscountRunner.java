//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		Discount test = new Discount(); 
		
		out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
		out.println("Bill after discount :: " + test.getDiscountedBill(amt)); 

	}
}