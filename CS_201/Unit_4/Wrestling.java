package ch3;


import java.util.*;
import java.text.*;

public class Wrestling extends Sports{

	public Wrestling (String sport_name, int competitors, String wrestler, int matches){
		super(sport_name, competitors, wrestler, matches);
	}
	public void displayMessage(){
		System.out.println(sportName + " takes " + playersNum + " for a match ");
		System.out.println(player + " has won " + games + " this season\n");
	}
}