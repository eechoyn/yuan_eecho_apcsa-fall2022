//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;
	private int player, computer; 

	public RockPaperScissors()
	{
		setPlayers(""); 
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player); 
	}

	public void setPlayers(String player)
	{
		playChoice = player; 
	}

	public String determineWinner()
	{
		if (playChoice=="R") player=0; 
		else if (playChoice=="P") player=1; 
		else if (playChoice=="S") player=2; 
		
		computer=(int)(Math.random()*3); 
		switch(computer) {
		case 0 : compChoice = "R"; break; 
		case 1 : compChoice = "P"; break; 
		case 2 : compChoice = "S"; break; 
		}
		
		String winner="";
		if (player>computer || (player==0&&computer==2) && !(player==2&&computer==0)){
			winner="Player"; 
		}
		else if (player==computer) {
			winner=""; 
		}
		else {
			winner="Computer"; 
		}
		return winner;
	}

	public String toString()
	{
		String output="";
		if (determineWinner().equals("")){
			output="Draw game!"; 
		}
		else {
			output = determineWinner() + " wins the game!"; 
		}
		output = "player had " + playChoice + "\ncomputer had " + compChoice + "\n" + output; 
		return output;
	}
}