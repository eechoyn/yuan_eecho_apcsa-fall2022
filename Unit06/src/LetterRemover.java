//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		setRemover("",'\u0000'); 
	}
	public LetterRemover(String s, char rem) {
		setRemover(s,rem); 
	}
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned=sentence;
		int loc = cleaned.indexOf(lookFor); 
		while (cleaned.indexOf(lookFor)!=-1){
			cleaned=cleaned.substring(0,loc)+cleaned.substring(loc+1); 
			loc = cleaned.indexOf(lookFor); 
		}
//		for (int i = 0; i<sentence.length(); i++) {
//			if (cleaned.charAt(i)==lookFor) {
//				cleaned = cleaned.substring(0,i)+cleaned.substring(i+1); 
//				i--; 
//			}
//		}
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor + "\n" + removeLetters();
	}
}