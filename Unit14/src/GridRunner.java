//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
		String[] vals = {"a", "b", "c"};
		Grid test = new Grid(3, 3, vals);
		System.out.println(test);
		System.out.println(test.findMax(vals) + " occurs the most.");
	}
}