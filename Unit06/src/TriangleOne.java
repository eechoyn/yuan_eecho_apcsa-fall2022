//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class TriangleOne
{
	private String word;

	public TriangleOne()
	{
		word="";
	}

	public TriangleOne(String s)
	{
		word=s; 
	}

	public void setWord(String s)
	{
		word=s; 
	}
	public String toString() {
		String printString = ""; 
		for (int i = word.length(); i!=0; i--) {
			printString += word.substring(0,i); 
			printString += "\n"; 
		}
		return printString; 
	}
}