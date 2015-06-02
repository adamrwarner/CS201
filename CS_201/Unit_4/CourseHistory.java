package ch3;


import java.util.*;
import java.text.*;

public class CourseHistory extends Courses{
	
	public CourseHistory(String name, String instName, String id, String desc){
		
		super(name, instName, id, desc);
	}
	
	public void displayMessage(){
		
		System.out.println( course + " is offered by the History Department and the course ID is:  " + courseID);	
		System.out.printf("The Instructor for " + course + " is " + instructor + " and the Description for this course is: " + description + "\n");
	
	}
}