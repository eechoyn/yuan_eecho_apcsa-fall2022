//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{
		wordRay = sentence.split(" "); 
	}

	public void sort()
	{
		for(int i = 0; i<wordRay.length-1; i++) {
			int loc = i; 
				for(int j=i+1; j<wordRay.length; j++) {
				if(wordRay[j].compareTo(wordRay[i])<0) {
					loc=j; 
					String temp=wordRay[i]; 
					wordRay[i]=wordRay[loc]; 
					wordRay[loc]=temp; 
				}
			}			
		}
	}

	public String toString()
	{
		String output="";
		sort(); 
		for(int i = 0; i<wordRay.length; i++) {
			output+=wordRay[i]+"\n"; 
		}
		return output+"\n\n";
	}
}