package ch3;


import java.util.*;
import java.text.*;

public class Courses{
	
	public String course;
	public String instructor;
	public String courseID;
	public String description;
	
	public Courses(String Course, String Instructor, String Courseid, String Description){
		
		course = Course;
		instructor = Instructor;
		courseID = Courseid;
		description = Description;
	}
	public void displayMessage(){
		
		System.out.println("The course in your curriculum is " + course + " and the course ID is:  " + courseID);		
		System.out.printf("The Instructor for " + course + " is " + instructor + " and the Description for this course is: " + description );
	}
}