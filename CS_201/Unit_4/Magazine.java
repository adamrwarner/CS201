package ch3;


import java.util.*;
import java.text.*;

public class Magazine extends ReadingMaterial{
	
	int pages;
	String characters;
	
	Magazine(){
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
		System.out.println("You chose Magazine:\n");
		System.out.println("The number of pages in this Magazine is: "+ getPages());
		System.out.println("The important journal author in this magazine is:"+getCharacters());
	}
}