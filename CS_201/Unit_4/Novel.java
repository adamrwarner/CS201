package ch3;


import java.util.*;
import java.text.*;

public class Novel extends ReadingMaterial{
	
	int pages;
	String characters;
	
	Novel(){
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
		System.out.println("You Chose Novel:\n");
		System.out.println("The number of pages in this Novel is: "+ getPages());
		System.out.println("The important character in this Novel is:"+getCharacters());
	}
}