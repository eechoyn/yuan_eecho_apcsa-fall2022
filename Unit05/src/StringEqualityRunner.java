//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		String testOne = "Same";
		String testTwo = "same"; 
		StringEquality test = new StringEquality(testOne, testTwo);
		test.checkEquality();
		System.out.print(test.toString());
		
	}
}