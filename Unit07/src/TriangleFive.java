//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		setLetter('A'); 
		setAmount(0); 
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c); 
		setAmount(amt); 
	}

	public void setLetter(char c)
	{
		letter = c; 
	}

	public void setAmount(int amt)
	{
		amount = amt; 
	}

	public String toString()
	{
		String output="";
		char let = letter; 
		int x = amount; 
		int y = amount; 
		
		for (int i1=amount; i1>0; i1--) {
			for (int i2=0; i2<i1; i2++) {
				while(x>0) {
					output += "" + let; 
					x--; 
				}
				y--; 
				x=y; 
				if(let=='Z') {
					let='A'; 
				}
				else {
					let=(char)(let+1); 
				}
				output += " "; 
			}
			let = letter; 
			x = amount; 
			y = amount; 
			output += "\n"; 
		}
		return output;
	}
}