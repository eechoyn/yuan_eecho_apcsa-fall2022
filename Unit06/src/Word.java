//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class Word
{
	private String word;

	public Word()
	{
		word=""; 
	}

	public Word(String s)
	{
		word=s; 
	}

	public void setString(String s)
	{
		word=s; 
	}

	public char getFirstChar()
	{
		return word.charAt(0);
	}

	public char getLastChar()
	{
		return word.charAt(word.length()-1);
	}

	public String getBackWards()
	{
		String back="";
		String cutWord = word; 
		for (int i = word.length(); i!=0; i--) {
			back += cutWord.substring(i-1); 
			cutWord=cutWord.substring(0,cutWord.length()-1); 
		}
		return back;
	}

 	public String toString()
 	{
 		return getFirstChar() + "\n" + getLastChar() + "\n" + getBackWards() + "\n" + word;
	}
}