package ch3;


import java.util.*;
import java.text.*;

public class Equipment{
	
	public double weight;
	public double cost;
	public String power;
	public String usage;
	public String manufacturer;
	public String electronic;
	
	
	public Equipment(double Weight, double Cost, String Power, String Usage, String Manufacturer, String Electronic){
		
		weight = Weight;
		cost = Cost;
		power = Power;
		usage = Usage;
		manufacturer = Manufacturer;
		electronic = Electronic;
	}
	public void displayMessage(){
		
		System.out.println("The type of electronic equipment is " + electronic + " and is used for" + usage + ", it's specs are:  \n");		
		System.out.println("The " + electronic + " is manufactured by " + manufacturer + " and it costs: " + cost + "\n");
		System.out.println("The " + electronic + " weighs " + weight + ", and is " + power + " powered.");
	}
}