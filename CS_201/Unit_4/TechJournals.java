package ch3;


import java.util.*;
import java.text.*;

public class TechJournals extends ReadingMaterial{
	
	int pages;
	String characters;
	
	TechJournals(){
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
		System.out.println("You chose Technical Journal:\n");
		System.out.println("The number of pages in this journal is: "+ getPages());
		System.out.println("The important journal author is:"+getCharacters());
	}
}