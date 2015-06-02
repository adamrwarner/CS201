package ch3;


import java.util.*;
import java.text.*;

public class EquipmentPhone extends Equipment{
	
	public EquipmentPhone(double Weight, double Cost, String Power, String Usage, String Manufacturer, String Electronic){
		
		super(Weight, Cost, Power, Usage, Manufacturer, Electronic);
	}
	
	public void displayMessage(){
		
		System.out.println("The type of electronic equipment is " + electronic + " and is used for" + usage + " ,it's specs are:  \n");		
		System.out.println("The " + electronic + " is manufactured by " + manufacturer + " and it costs: $" + cost + "\n");
		System.out.println("The " + electronic + " weighs " + weight + "lbs, and is " + power + " powered.");		
	
	}
}