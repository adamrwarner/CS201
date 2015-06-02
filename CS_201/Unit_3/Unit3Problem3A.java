package Unit_3;


import java.util.*;
import java.text.*;

public class Unit3Problem3A{		
	
	public static void main(String args[]){
		
		CycleA bicycleA = new CycleA(2,10);
		bicycleA.output();
	}
}
class CycleA{
	
	private int numberOfWheels;
	private int weight;
	
	CycleA(int numberOfWheels, int weight){
		this.numberOfWheels = numberOfWheels;
		this.weight = weight;
	}
	
	public void output(){
		
		System.out.println("The number of wheels on the bike are: " + numberOfWheels);
		System.out.println("The weight of the bike is: "+ weight);
	}
}