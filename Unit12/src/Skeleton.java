//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class Skeleton implements Monster
{
	//add instance variables	
	private String name; 
	private int age; 
	
	//add a constructor
	public Skeleton() {
		name = ""; 
		age = 0; 
	}
	public Skeleton(String nameE, int ageE) {
		name = nameE; 
		age= ageE; 
	}

	//add code to implement the Monster interface

	public int getHowBig() {
		return age; 
	}
	public String getName() {
		return name; 
	}
	public boolean isBigger(Monster other) {
		if(other.getHowBig()<this.getHowBig()) {
			return true; 
		}
		else {
			return false; 
		}
	}
	public boolean isSmaller(Monster other) {
		if(other.getHowBig()>this.getHowBig()) {
			return true; 
		}
		else {
			return false; 
		}
	}
	public boolean namesTheSame(Monster other) {
		if(other.getName().equals(this.getName())) {
			return true; 
		}
		return false; 
	}
	
	//add a toString
	
	public String toString() {
		String output= this.getName() + " " + this.getHowBig(); 
		return output; 
	}
}