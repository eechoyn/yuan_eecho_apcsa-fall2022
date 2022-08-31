//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		
		//add in a do while loop after you get the basics up and running
		
			String player = "";
		
			do {
				out.print("type in your prompt [R,P,S] :: ");
				RockPaperScissors game = new RockPaperScissors(keyboard.next());
				game.determineWinner(); 
				System.out.println(game); 
				
				System.out.print("Do you want to play again? [y,n]");
				response = keyboard.next().charAt(0); 
			}
			while(response=='Y'||response=='y');
	}
}



