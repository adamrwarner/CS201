package ch3;


import java.util.*;
import java.text.*;

public class Sports{		

	public String sportName;
	public int playersNum;
	public String player;
	public int games;
	
	public Sports(String sport, int players, String Player, int Games){
		
		sportName = sport;
		playersNum = players;
		player = Player;
		games = Games;
	}
	
	public void displayMessage(){
		
		System.out.println("Sport name is " + sportName + " , played by" + playersNum);
		System.out.println("The current stats for this year are: " + player + " and they have won " + games + " games\n");
	}
}