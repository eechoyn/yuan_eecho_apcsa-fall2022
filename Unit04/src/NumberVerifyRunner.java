//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		//add in input
		Scanner keyboard = new Scanner(in);
		
		out.print("Enter a whole number :: ");
		int num1 = keyboard.nextInt();

		NumberVerify test1 = new NumberVerify(); 
		System.out.println(num1 + " is odd :: " + test1.isOdd(num1));
		System.out.println(num1 + " is even :: " + test1.isEven(num1));
		
		
		System.out.println("5 is odd :: " + NumberVerify.isOdd(5));
		System.out.println("5 is even :: " + NumberVerify.isEven(5));

		//add in more test cases
		
		System.out.println("2000 is odd :: " + NumberVerify.isOdd(2000));
		System.out.println("2000 is even" + NumberVerify.isEven(2000));
		
		System.out.println("-533 is odd :: " + NumberVerify.isOdd(-533));
		System.out.println("-533 is even :: " + NumberVerify.isEven(-533));
		
	}
}