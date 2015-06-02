package ch3;


import java.util.*;
import java.text.*;

public class Hockey extends Sports{
	
	public String stick;
	public String puck;
	public String team;
	public int gamesNum;
	
	
	public Hockey(String sport, int players, String Stick, String Puck, String Team, int games){
		super(sport, players, Stick, games);
		this.stick = Stick;
		this.puck = Puck;
		this.team = Team;
		this.gamesNum = games;
	}
	public void displayMessage(){
		System.out.println(sportName + " is played by " + playersNum + " people and is played with a " + stick + " and " + puck);
		System.out.println("The " + team + " won " + gamesNum + " games this season\n");
	}
}