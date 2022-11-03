//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		while (number>0) {
			count++; 
			number=number/10; 
		}
		return count;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int[] sorted = new int[getNumDigits(number)];
		int num = number; 
		
		for(int i = 0; i<sorted.length; i++) {
			sorted[i]=num%10; 
			num=num/10; 
		}
		
		for (int i = 1; i < sorted.length; ++i) {
            int val = sorted[i];
            int j = i - 1;
 
            while (j >= 0 && sorted[j] > val) {
            	sorted[j + 1] = sorted[j];
                j = j - 1;
            }
            sorted[j + 1] = val;
        }
	
		return sorted;
	}
}