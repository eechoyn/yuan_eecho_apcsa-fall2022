//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		//ask for name and size
		System.out.println("Enter 1st monster's name : "); 
		String name1 = keyboard.next(); 
		System.out.println("Enter 1st monster's size : "); 
		int size1 = keyboard.nextInt(); 
		System.out.println("Enter 2nd monster's name : "); 
		String name2 = keyboard.next(); 
		System.out.println("Enter 2nd monster's size : "); 
		int size2 = keyboard.nextInt(); 
		//instantiate monster one
		Skeleton monster1 = new Skeleton(name1,size1); 
		Skeleton monster2 = new Skeleton(name2,size2); 
		
		//ask for name and size
		System.out.println("Monster 1 - " + monster1); 
		System.out.println("Monster 2 - " + monster2); 
		
		//instantiate monster two
		
		String sizeComp = ""; 
		if (monster1.isBigger(monster2)) {
			sizeComp = "bigger"; 
		}
		else if (monster1.isSmaller(monster2)) {
			sizeComp = "smaller"; 
		}
		String nameComp = "does not"; 
		if (monster1.namesTheSame(monster2)) {
			nameComp="does"; 
		}
		
		System.out.println("Monster one is " + sizeComp + " than Monster two.\nMonster one " + nameComp + " have the same name as Monster two;");
	}
}