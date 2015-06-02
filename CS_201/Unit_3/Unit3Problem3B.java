package Unit_3;


import java.util.*;
import java.text.*;

public class Unit3Problem3B{		

	public static void main(String args[]){

		CycleB bicycleB=new CycleB();
		bicycleB.output();
	}
}	
class CycleB{

	private int numberOfWheels;
	private int weight;

	CycleB(){
		this(100,1000);
	}
	CycleB(int numberOfWheels,int weight){
		this.numberOfWheels = numberOfWheels;
		this.weight = weight;
	}
	public void output(){

		System.out.println("The number of wheels on the bike are: " + numberOfWheels);
		System.out.println("The weight of the bike is: "+ weight);
	}		
}