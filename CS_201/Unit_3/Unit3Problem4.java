package Unit_3;


import java.util.*;
import java.text.*;

public class Unit3Problem4{		

	public static void main(String[] args) {

		Book Java = new Book("Intro to Java Programming - Comprehensive Version (10th Edition)", "Y. Daniel Liang", 1320);
		Book Hadoop = new Book("Hadoop - The Definitive Guide", "Tom White", 657);
		Book Pentaho = new Book("Pentaho Analytics for MongoDB", "Bo White", 129);
		Book Gone = new Book("Gone Girl", "Gillian Flynn", 432);
		Book Mind = new Book("The Mind Readers", "Lori Brighton", 238);
		Book[] bookArray = {Java, Hadoop, Pentaho, Gone, Mind};

		Volume volume1 = new Volume("Volume1", bookArray.length, bookArray);

		System.out.println(volume1);
	}
}

class Book {

	private String title;
	private String author;
	private int numberOfPages;

	public Book(String title, String author, int numberOfPages) {
		super();
		this.title = title;
		this.author = author;
		this.numberOfPages = numberOfPages;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("	The Title is: " + title + "\n");
		builder.append("	The Author of " + title + " is: " + author + "\n");
		builder.append("	The Number of pages in " + title + " is: " + numberOfPages + "\n");
		return builder.toString();
	}
}

class Volume {

	private String volumeName;
	private int numberOfBooks;
	private Book[] books;

	public Volume(String volumeName, int numberOfBooks, Book[] books) {
		super();
		this.volumeName = volumeName;
		this.numberOfBooks = numberOfBooks;
		this.books = books;
	}

	public String getBookArray(){
		
		String booksArray = "";
		for(int i=0; i<books.length; i++){
			booksArray = booksArray+books[i].toString();
		}
		return booksArray;
	}

	public String toString() {
		
		StringBuilder builder = new StringBuilder();
		builder.append("The Current volume is: " + volumeName + "\n");
		builder.append("The Number of Books in " + volumeName + " is: " + numberOfBooks + "\n");
		builder.append("The Books in " + volumeName + " are:\n\n");
		builder.append(getBookArray());
		
		return builder.toString();
	}
}
