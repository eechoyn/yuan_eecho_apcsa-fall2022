//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;
   
	//add constructors

	//add a set method
   public Perfect() {
	   number = 0; 
   }
   public Perfect(int num) {
	   number = num; 
   }
   public void setNumber(int num) {
	   number = num; 
   }
   public int getDivisor() {
	   int sum = 0; 
	   for (int i = 1; i<number; i++) {
		   if (number%i==0) {
			   sum += i; 
		   }
	   }
	   return sum;
   }
   	public boolean isPerfect()
	{
		if (getDivisor()==number) {
			return true; 
		}
		else {
			return false; 
		}
	}
   	public String toString() {
   		if (isPerfect()) {
   			return number + " is a perfect number."; 
   		}
   		else {
   			return number + " is not a perfect number."; 
   		}
   	}
	
}