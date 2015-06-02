package Unit_3;


import java.util.*;
import java.text.*;

public class Builder_Unit3Problem5{		

	public static void main(String args[])
	{
		Scanner stringInput = new Scanner(System.in);
		System.out.println("Enter the string 'Java is fun!':");
		String input1 = stringInput.nextLine();
		
		StringBuilder builder1 = new StringBuilder(input1);
		StringBuilder builder2 = new StringBuilder(input1);
		
		System.out.println("The capacity of the string is you entered is: " + builder1.capacity());
		builder1.append(" I love it! ");
		System.out.println("The complete string is: " + builder1);
		
		System.out.println("Enter the string 'Yes!': ");
		String input2 = stringInput.nextLine();
		builder1.insert(builder2.length(), " " + input2 + " ");
		System.out.println("The new complete string is: " + builder1);
		stringInput.close();
	}

}
