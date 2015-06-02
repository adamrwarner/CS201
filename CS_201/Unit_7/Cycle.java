package Unit_7;


import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Cycle{		
	
	private int numberOfWheels;
	private int weight;
	
	Cycle (int numberOfWheels, int weight){
		this.numberOfWheels = numberOfWheels;
		this.weight = weight;		
	}
	
	public void output() throws Exception{
		
		PrintWriter cycleOut = null;
		
		if (numberOfWheels <= 0){
			throw new Exception();
		}
		
		try{
			cycleOut = new PrintWriter("Cycle.txt");
		} catch (FileNotFoundException e) {
			System.err.println("file already exists");
			e.printStackTrace();
		}
		
		cycleOut.println("The number of wheels on the bike are: " + numberOfWheels);
		cycleOut.println("The weight of the bike is: "+ weight);
		cycleOut.close();
	}
}