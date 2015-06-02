package Unit_3;


import java.util.*;
import java.text.*;

public class Unit3Problem6{		

	public static void main(String[] args) {
		
		System.out.println("Please enter an alpha-numeric string:");
		Scanner AlphaNum = new Scanner(System.in);
		StringBuilder alphaNum = new StringBuilder(AlphaNum.nextLine());
		
		System.out.println("The alpha-numeric string you entered is: ");
		System.out.println(alphaNum);
		
		for (int i = 0; i < alphaNum.length(); i++) {
			System.out.println("the character is:");
			if(Character.isDigit(alphaNum.charAt(i))) {
				System.out.println("*");
			}
			else if (Character.isUpperCase(alphaNum.charAt(i))){
				System.out.println("Uppercase");
				System.out.println(Character.toLowerCase(alphaNum.charAt(i)));
			}
			else if (Character.isLowerCase(alphaNum.charAt(i))){
				System.out.println("Lowercase");
				System.out.println(Character.toUpperCase(alphaNum.charAt(i)));
			}
		}
		AlphaNum.close();
	}
}
