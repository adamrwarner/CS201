package ch3;


import java.util.*;
import java.text.*;

public class TableTennis extends Sports{
	
	public String paddle;
	public String player;
	public int matches;

	public TableTennis(String sport, int players, String Paddle, String Player, int Matches){
		super(sport, players, Player, Matches);
		this.paddle = Paddle;
		this.player = Player;
		this.matches = Matches;
	}
	public void displayMessage(){
		System.out.println(sportName + " takes " + playersNum + " opponents and is played with a " + paddle);
		System.out.println(player + " won " + matches + " matches\n");
	}
}