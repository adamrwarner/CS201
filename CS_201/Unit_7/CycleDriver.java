package Unit_7;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class CycleDriver{		

	public static void main(String args[]){

		int numberOfWheels, weight;
		String inFile = "CycleIn.txt";
		File InFile = new File(inFile);

		try {
			try{
				Scanner CycleProps = new Scanner(InFile);
				while (CycleProps.hasNext()){
					numberOfWheels = CycleProps.nextInt();
					weight = CycleProps.nextInt();

					Cycle bicycle = new Cycle(numberOfWheels,weight);

					bicycle.output();

				}
				CycleProps.close();
			}catch (FileNotFoundException e){
				System.err.println("File not Found");
			}			

		} catch (Exception e) {

			System.err.println("Values cannot be less than or equal to zero");
			e.printStackTrace();
		}
	}
}
