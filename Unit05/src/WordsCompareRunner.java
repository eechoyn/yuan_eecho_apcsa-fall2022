//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
		String testOne = "abe"; 
		String testTwo = "ape"; 
		WordsCompare test = new WordsCompare(testOne, testTwo); 
		test.compare(); 
		System.out.println(test.toString()); 

	}
}