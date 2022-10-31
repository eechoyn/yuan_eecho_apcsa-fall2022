//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static ArrayList<Integer> getRowTotals( int[][] m )
    {
    	ArrayList<Integer> rowCount = new ArrayList<Integer>(); 
    	for (int[] row : m) {
    		int sum = 0; 
    		for (int num:row) {
    			sum+=num; 
    		}
    		rowCount.add(sum); 
    	}
		return rowCount;
    }
}
