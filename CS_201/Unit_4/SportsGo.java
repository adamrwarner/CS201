package ch3;


import java.util.*;

public class SportsGo{
	
	public static void main(String []args){
		
		Sports sport1, sport2, sport3;
		
		sport1 = new Wrestling("Wrestling", 2, "Frank Smith", 5);
		sport1.displayMessage();
		
		sport2 = new Hockey("Hockey", 6, "hockey stick", "puck", "The Red Wings", 8);
		sport2.displayMessage();
		
		sport3 = new TableTennis("Table Tennis", 2, "ping-pong ball", "Gary Michaels", 4);
		sport3.displayMessage();
	}
}