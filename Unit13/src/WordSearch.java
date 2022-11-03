//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;

    public WordSearch( int size, String str )
    {
    	m = new String[size][size]; 
    	int valIndex = 0; 
    	for (int i = 0; i<size; i++) {
    		for (int j = 0; j<size; j++) {
    			m[i][j]=""+str.charAt(valIndex); 
    			valIndex++; 
    		}
    	}
    }

    public boolean isFound( String word )
    {
    	for (int i = 0; i<m.length; i++) {
    		for (int j = 0; j<m[i].length; j++) {
    			if (checkRight(word,i,j)||checkLeft(word,i,j)||checkUp(word,i,j)||checkDown(word,i,j)||checkDiagUpRight(word,i,j)||checkDiagUpLeft(word,i,j)||checkDiagDownLeft(word,i,j)||checkDiagDownRight(word,i,j)) {
    				return true; 
    			}
    		}
    	}
    	return false; 
    }

	public boolean checkRight(String w, int r, int c)
   {
		String searched = ""; 
		for(int i=c; i<c+w.length() && i<m[r].length; i++) {
			searched+=m[r][i]; 
		}
		if(searched.equals(w)) {
			return true; 
		}
		else {
			return false; 
		}
	}

	public boolean checkLeft(String w, int r, int c)
	{
		String searched = ""; 
		for(int i=c; i>c-w.length() && i>=0; i--) {
			searched+=m[r][i]; 
		}
		if(searched.equals(w)) {
			return true; 
		}
		else {
			return false; 
		}
	}

	public boolean checkUp(String w, int r, int c)
	{
		String searched = ""; 
		for(int i=r; i>m.length-w.length() && i>=0; i--) {
			searched+=m[i][c]; 
		}
		if(searched.equals(w)) {
			return true; 
		}
		else {
			return false; 
		}
	}

	public boolean checkDown(String w, int r, int c)
   {
		String searched = ""; 
		for(int i=r; i<r+w.length() && i<m.length; i++) {
			searched+=m[i][c]; 
		}
		if(searched.equals(w)) {
			return true; 
		}
		else {
			return false; 
		}
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		String searched = ""; 
		for(int i=r, j=c; i>m.length-w.length() && i>=0 && j<c+w.length() && j<m.length; i--, j++) {
			searched+=m[i][j]; 
		}
		if(searched.equals(w)) {
			return true; 
		}
		else {
			return false; 
		}
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		String searched = ""; 
		for(int i=r, j=c; i>m.length-w.length() && i>=0 && j>c-w.length() && j>=0; i--, j--) {
			searched+=m[i][j]; 
		}
		if(searched.equals(w)) {
			return true; 
		}
		else {
			return false; 
		}
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		String searched = ""; 
		for(int i=r, j=c; i<r+w.length() && i<m[r].length && j>c-w.length() && j>=0; i++, j--) {
			searched+=m[i][j]; 
		}
		if(searched.equals(w)) {
			return true; 
		}
		else {
			return false; 
		}
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		String searched = ""; 
		for(int i=r, j=c; i<r+w.length() && i<m[r].length && j<c+w.length() && j<m.length; i++, j++) {
			searched+=m[i][j]; 
		}
		if(searched.equals(w)) {
			return true; 
		}
		else {
			return false; 
		}
	}

    public String toString(String word)
    {
    	String output="";
		for (String[] row : m) {
			for (String num : row) {
				output += num; 
			}
			output+="\n"; 
		}
		return output;
    }
}
