//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	private int numerator; 
	private int denominator; 
	private int num, den; 
	//write two constructors
	public Rational() {
		setRational(1,1);
	}
	public Rational(int nume, int dem) {
		setRational(nume,dem);
	}
	//write a setRational method
	public void setRational(int nume, int dem) {
		num = nume; 
		den = dem; 
	}
	//write  a set method for numerator and denominator
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		int num2 = other.getNum(); 
		int den2 = other.getDen(); 
		int num1 = num; 
		int den1 = den; 
		
		num = (num1 * den2 + num2 * den1); 
		den = (den1 * den2); 
		
		reduce();
	}

	private void reduce()
	{
		if(num!=0) {
			int common = gcd(num,den); 
			num = num/common; 
			den = den/common; 
		}
		
	}

	private int gcd(int numOne, int numTwo)
	{
		int gcd=1; 
		for (int i = 1; i<numOne*numTwo; i++) {
			if (numOne%i==0 && numTwo%i==0 ) {
				gcd=i; 
			}
		}
		return gcd;
	}

	public Rational clone ()
	{
		Rational obj = new Rational(num, den);
		return obj;
	}

	//ACCESSORS
	//write get methods for numerator and denominator
	public int getNum() {
		return num; 
	}
	public int getDen() {
		return den; 
	}
	
	public boolean equals( Rational obj)
	{
		this.reduce(); 
		obj.reduce(); 
		if(this.getDen()==obj.getDen() && this.getNum()==obj.getNum()) {
			return true;
		}
		else {
			return false; 
		}
	}

	public int compareTo(Rational other)
	{
		if(equals(other)) {
			return 0; 
		}
		else if((double)this.getNum()/(double)this.getDen()>(double)other.getNum()/(double)other.getDen()){
			return 1; 
		}
		else {
			return -1; 
		}
	}
	public String toString() {
		return num + "/" + den;
	}
	//write  toString() method
	
	
}