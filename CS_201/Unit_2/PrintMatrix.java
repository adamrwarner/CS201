package Unit_2;


import java.util.Random;
import java.util.Scanner;

public class PrintMatrix {

	public static void main(String[] args) {
		
		Scanner nInput = new Scanner(System.in); 
		System.out.print("Enter value for n: "); 
		int n = 0; 
		n = nInput.nextInt(); 
		printMatrix( n); 
		nInput.close();		
	} 

	public static void printMatrix(int n) { 
		
		int index; 		
		Random matrixGen = new Random(); 
		for(int row = 0; row < n; row++) { 
			for(int column = 0; column < n; column++) { 
				index = matrixGen.nextInt(2); 
				System.out.print(index + " "); 
			} 
			System.out.println(); 
		} 
	} 
} 