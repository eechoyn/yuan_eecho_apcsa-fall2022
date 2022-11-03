//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	private static int[] nums; 
	public static String makeLucky7Array( int size)
	{
		nums = new int[size]; 
		for (int i =0; i<size;i++) {
			nums[i]=(int) (10*(Math.random())) +1;
		}
		return Arrays.toString(nums) +"\n" + Arrays.toString(shiftEm(nums)); 
	}
	public static int[] shiftEm(int[] array)
	{
		for(int i = 0; i<array.length-1; i++) {
			int loc = i; 
				for(int j=i+1; j<array.length; j++) {
				if(array[j]==7) {
					loc=j; 
				}
				if(array[i]!=7) {
					int temp=array[i]; 
					array[i]=array[loc]; 
					array[loc]=temp; 
				}
			}			
		}
		return array; 
	}
}