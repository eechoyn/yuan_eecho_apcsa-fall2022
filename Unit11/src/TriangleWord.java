//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
	//instance variables and constructors could be present, but are not necessary
		
	public static String toString(String word)
	{
		String output = "";
		for (int i = 0; i<=word.length(); i++) {
			for (int j = 0; j<i; j++) {
					output += word.substring(0,i); 
			}
			output+="\n"; 
		}
		return output; 
	}
}