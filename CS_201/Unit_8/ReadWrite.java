package Unit_8;

import java.io.*;
import java.util.*;

public class ReadWrite{

	public static void main(String[] args) throws IOException{

		Scanner Choice = new Scanner(System.in);
		Scanner Students = new Scanner(System.in);
		Scanner Sid = new Scanner(System.in);
		Scanner StudentSearch = new Scanner(System.in);		
		File studentFile = new File("Stu.dat");
		
		while(true){
			try {
				System.out.println("Enter (1) to enter student records");
				System.out.println("Enter (2) to search student GPA");
				System.out.println("Enter (3) to Exit");
				int choice = Choice.nextInt();
				
				if (choice == 1){
					PrintWriter studentOut = new PrintWriter(studentFile);
					System.out.println("Enter the total number of students");					
					int numOfStudents = Students.nextInt();																				
					while (numOfStudents > 0){
						System.out.println("Enter Student ID number and GPA (comma separated)");
						String SID = Sid.nextLine();						
						studentOut.println(SID);
						numOfStudents--;						
					}
					studentOut.close();
				}
				if (choice == 2){				
					System.out.println("Please enter the Student Number to search");
					String studentSearch = StudentSearch.nextLine();
					Scanner lineReader = new Scanner(studentFile);
					//System.out.println(studentFile);
					while (lineReader.hasNext()){
						String lineIn = lineReader.nextLine();
						//System.out.println(lineIn);
						//System.out.println(studentSearch);
						if (lineIn.contains(studentSearch)){
							System.out.println("The GPA for student number " + studentSearch + " is: " + lineIn + "\n");
						}
						else{
							System.out.println("Student ID not found");
						}
					}
						
				}
				else if (choice == 3){
					System.out.println("Goodbye");
					System.exit(0);	
				}				
			}

			catch(Exception e){
				System.out.println("there is no such file");
			}
			finally{
				//studentOut.close();
			}
		}

	}
}