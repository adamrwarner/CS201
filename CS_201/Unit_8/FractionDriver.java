package Unit_8;

import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class FractionDriver {
	
	public static void main(String[] args) throws Exception{
		
		Scanner fractionInput = new Scanner(System.in);
		Fraction[] fractions = new Fraction[3]; 
		
		FileOutputStream fractionOut = new FileOutputStream("SerialF.dat");
		ObjectOutputStream SerialObject = new ObjectOutputStream(fractionOut);		
		
		for(int i = 0; i < 3; i++){

			System.out.print("\nPlease enter the numerator:");
			int numerator = fractionInput.nextInt();
			System.out.print("Please enter the denominator:");
			int denominator = fractionInput.nextInt();
			
			fractions[i] = new Fraction(numerator, denominator); 

			SerialObject.writeObject(fractions[i]);
		}
		fractionInput.close();
		SerialObject.close();
	}
}