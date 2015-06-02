package ch3;


import java.util.*;
import java.text.*;

public class Textbooks extends ReadingMaterial{
	
	int pages;
	String characters;
	
	Textbooks(){
		pages=0;
		characters="";
	
	}
	int getPages(){
		return pages;
	}
	void setPages(int num){
		this.pages=num;
	}
	String getCharacters(){
		return characters;
	}
	void setCharacters(String names){
		this.characters=names;
	}
	public void displayMessage(){
		System.out.println("You chose Textbook:\n");
		System.out.println("The number of pages in this text book is: "+ getPages());
		System.out.println("The text book publisher is:"+getCharacters());
	}
}