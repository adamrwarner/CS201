package ch3;


import java.util.Scanner;

public class ReadingMaterial{
	
	public static void main(String args[])	{				

		int pages;
		String characters;

		System.out.println("Choose a type of publication you are interested in: ");
		System.out.println("Choose (1) for Technical Journals");
		System.out.println("Choose (2) for Magazine");
		System.out.println("Choose (3) for Textbooks");
		System.out.println("Choose (4) for Novel");			
		
		Scanner chooser=new Scanner(System.in);
		int pubChoice = chooser.nextInt();

		System.out.println("Enter number of pages:");
		pages=chooser.nextInt();		
		
		if (pubChoice == 1){
	 		TechJournals tech = new TechJournals();
	
			tech.setPages(pages);
			System.out.println("Enter the journal contributors (with spaces):");
			characters=chooser.next();
			tech.setCharacters(characters);
			tech.displayMessage();
		}		
		if (pubChoice == 2){
			Magazine magazine = new Magazine();
			
			magazine.setPages(pages);
			System.out.println("Enter the article authors (with spaces):");
			characters=chooser.next();
			magazine.setCharacters(characters);
			magazine.displayMessage();			
			
		}
		if (pubChoice == 3){
			Textbooks textBook=new Textbooks();
			
			textBook.setPages(pages);
			System.out.println("Enter the publisher:");
			characters=chooser.next();
			textBook.setCharacters(characters);
			textBook.displayMessage();
		}
		if (pubChoice == 4){
			Novel novel = new Novel();
						
			novel.setPages(pages);
			System.out.println("Enter names of characters (with spaces):");
			characters=chooser.next();
			novel.setCharacters(characters);
			novel.displayMessage();
		}
		chooser.close();
	}
}
