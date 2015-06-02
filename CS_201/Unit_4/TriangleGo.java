package ch3;


import java.util.*;
import java.math.*;
import java.util.Scanner;

public class TriangleGo{

	public static void main(String[] args) {
		
		Triangle triangle = new Triangle(1, 1.5, 1);
		//System.out.println(triangle);

		triangle.setColor("yellow");
		triangle.setFilled(true);

		System.out.println("The area of your Triangle is " + triangle.getArea());
		System.out.println("The perimeter of your Triangle is " + triangle.getPerimeter());
		System.out.println(triangle);
	}


}