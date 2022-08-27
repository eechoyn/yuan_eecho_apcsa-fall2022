//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		LetterRemover test = new LetterRemover("I am Sam I am", 'a'); 
		test.removeLetters(); 
		System.out.println(test.toString()); 
		LetterRemover test2 = new LetterRemover("ssssssssxssssesssssesss", 's'); 
		test2.removeLetters(); 
		System.out.println(test2.toString()); 
		LetterRemover test3 = new LetterRemover("abaababababa", 'x'); 
		test3.removeLetters(); 
		System.out.println(test3.toString()); 
											
	}
}