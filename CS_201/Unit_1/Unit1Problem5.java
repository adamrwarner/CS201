package Unit_1;


import java.util.Scanner;
import org.apache.commons.math3.complex.*;

//take user input for 4 variables(real1, imaginary1, real2, imaginary2) and assign them respectively
//calculate each of the different requirements (addition, subtraction, multiplication and division) 
//with the assigned variables
//https://commons.apache.org/proper/commons-math/userguide/complex.html

public class Unit1Problem5{

	public static void main(String[] args){
		double a1 = 0, a2 = 0;
		double b1 = 0, b2 = 0;
		
		System.out.println("Please enter the first Real part for the Complex number calculation:");
		Scanner Real = new Scanner(System.in);
		a1 = Real.nextDouble();
		System.out.println("Please enter the first Imaginary part for the Complex number calculation: ");
		Scanner Imaginary = new Scanner(System.in);
		a2 = Imaginary.nextDouble();
		
		System.out.println("Please enter the second Real part for the Complex number calculation:");
		Scanner Real2 = new Scanner(System.in);
		b2 = Real2.nextDouble();
		System.out.println("Please enter the second Imaginary part for the Complex number calculation: ");
		Scanner Imaginary2 = new Scanner(System.in);
		b2 = Imaginary2.nextDouble();
		
		Complex z1 = new Complex(a1, b1);
		Complex z2 = new Complex(a2, b2);

		Complex answerAdd = z1.add(z2);       // add two complex numbers
		Complex answerSub = z1.subtract(z2);  // subtract two complex numbers
		Complex answerMult = z1.multiply(z2); // multiply two complex numbers
		Complex answerDiv = z1.divide(z2); // divide two complex numbers

		System.out.println("Addition of the real and imaginary numbers: "+ answerAdd); 
		System.out.println("Subtraction of the real and imaginary numbers: "+ answerSub);
		System.out.println("Multiplication of the real and imaginary numbers: "+ answerMult);
		System.out.println("Division of the real and imaginary numbers: "+ answerDiv);
	}
}