package ch3;


import java.util.*;
import java.text.*;

public class Triangle extends GeometricObject {

	double side1 = 1.0;
	double side2 = 1.0;
	double side3 = 1.0;

	public Triangle() {
		
		side1 = 0.0;
		side2 = 0.0;
		side3 = 0.0;
	}

	public Triangle(double Side1, double Side2, double Side3) {
		
		side1 = Side1;
		side2 = Side2;
		side3 = Side3;
	}

	public double getArea(){
		
		double number1 = 0.0;
		double number2 = 0.0;
		number1 = 0.5*(side1 + side2 + side3);
		number2 = number1*((number1-side1)*(number1-side2)*(number1-side3));
		return Math.sqrt(number2);
	}

	public double getPerimeter(){
		
		return (side1 + side2 + side3);
	}

	public String toString(){
		
		return "The stats for your triangle  are: "+ 
				"\nThe length of side1 is = " + side1 + 
				"\nThe length of side2 is = " + side2 +
				"\nThe length of side3 is = " + side3 + 
				"\nThe color of your triangle is = " + getColor() + 
				"\nIs your triangle filled (t/f)? = " + isFilled(); 
	}
}