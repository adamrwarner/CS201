package Unit_7;


import java.util.Scanner;

//1271026 is my student id
//algorithm pseudo-code:
//take user input of their student id, divide by 4 and add 2 to the remainder to find chapter
//if statements to find which chapter, then apply remainder equation to find the exercise
//take user input after user looks up the page number for the exercise
//display supplied output with correct values

public class SolveAndDiscuss{
	
	public static void main(String[] args){
	
	Scanner sid = new Scanner(System.in);
	long SID;
	int page = 0;
	System.out.println("Please enter your student ID number:");
	SID = sid.nextLong();
	long numz = (SID % 20)+1;
	//long abs_number = (numz < 0) ? -numz : numz;
	System.out.println(numz);
	//my id is 1271026
	
	//Divide the integer number representing your student ID by 4, consider the remainder and increment it by 2. 
	//The result you obtain represents the chapter number, and it should be either 2, 3 ,4 or 5.	
	long chapter = ((SID % 3)+8); //1271026 / 4 = 317756.5, remainder = 1 + 2 = 3
	long exercise = 0;
	
	//Depending on the chapter number obtained above, consider the following rules in calculating the problem number to solve:
	//If the chapter number is 2, divide your student ID by 26, consider the remainder and increment it by 1. 
	//The result you obtain represents the number of the programming exercise you will solve for online discussions, which should be from chapter 2.
	if(chapter == 2){
		exercise = (SID%26)+1;
	}
	//If the chapter number is 3, divide your student ID by 34, consider the remainder and increment it by 1. 
	//The result you obtain represents the number of the programming exercise you will solve for online discussions, which should be from chapter 3.
	if(chapter == 3){
		exercise = (SID%34)+1;
	}
	//If the chapter number is 4, divide your student ID by 46, consider the remainder and increment it by 1. 
	//The result you obtain represents the number of the programming exercise you will solve for online discussions, which should be from chapter 4.
	if(chapter == 4){
		exercise = (SID%46)+1;
	}
	//If the chapter number is 5, divide your student ID by 38, consider the remainder and increment it by 1. 
	//The result you obtain represents the number of the programming exercise you will solve for online discussions, which should be from chapter 5.  
	if(chapter == 5){
		exercise = (SID%38)+1;
	}
	if(chapter == 9){
		exercise = ((SID % 31)+1);
	}
	System.out.println("Your chapter is: "+ chapter);
	System.out.println("Your exercise is: "+ exercise);
	System.out.println("Please enter the page number where your exercise is found:");
	Scanner Page = new Scanner(System.in);
	page = Page.nextInt();
	System.out.println("Please solve programming exercise "+exercise+" from chapter "+chapter+", on page "+page+".");
	
	sid.close();
	}	
}