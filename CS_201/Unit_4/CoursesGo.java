package ch3;


import java.util.*;
import java.text.*;

public class CoursesGo{
	
	public static void main(String []args){
		
		Courses history, math, english, photography;
		
		history = new CourseHistory("History 202", "Barry Gibb", "Hist202", "This course is a survey of Ancient Egyptian History");
		history.displayMessage();
		System.out.println("\n");
		
		math = new CourseMath("Calculus 202", "Matthew Potter","Mth202", "This course is dedicated to extending your understanding of basic Calculus methods");
		math.displayMessage();
		System.out.println("\n");
		
		english = new CourseEnglish("English 300", "Dr. Gregory House","Eng300", "This course is intended to teach basics of journalism");
		english.displayMessage();
		System.out.println("\n");
		
		photography = new CoursePhotography("Photography 332", "Sherlock Holmes", "Phot332", "This course is an advanced techniques course in photo-journalism");			
		photography.displayMessage();
		System.out.println("\n");
	}
}