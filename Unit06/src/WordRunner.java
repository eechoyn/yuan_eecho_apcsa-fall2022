//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class WordRunner
{
	public static void main ( String[] args )
	{
		Word test = new Word("Hello"); 
		test.getFirstChar(); 
		test.getLastChar(); 
		test.getBackWards(); 
		System.out.print(test.toString()); 
	}
}