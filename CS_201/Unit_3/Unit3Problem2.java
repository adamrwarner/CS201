package Unit_3;


import java.util.*;
import java.text.*;

public class Unit3Problem2{		
	
	public static void main(String[] args){
		
		Locker open = new Locker();
		open.openLocker();		
	}
}

class CombinationLock{
	
	private boolean dial = true; 
	private boolean flag1, flag2, flag3;
	private int combo1, combo2, combo3; 
	private int position = 0;
	
	public CombinationLock (int combo1, int combo2, int combo3){
		this.combo1 = combo1;
		this.combo2 = combo2;
		this.combo3 = combo3;
	}
	
	public void resetDial(){
		dial = true; 
		flag1 = false;
		flag2 = false;
		flag3 = false; 
	}
	
	public void turnLeft (int ticks){
		if (position + ticks < 40 ){
			position += ticks;
			flag2 = false;
			if (position == combo2 ){
				flag2 = true;
			}
		}else{
			position = ( (position + ticks) - 40 );
			flag2 = false;  
			if (position == combo2){
				flag2 = true; 
			}
		}
	}
	
	public void turnRight (int ticks){
		if (dial){
			position = (40 - ticks);
			flag1 = false;
			dial = false;
			if (position == combo1){
				flag1 = true;
			}
		}else{
			if (position - ticks > 0 ){
				position = position - ticks; 
				flag3 = false; 
				if (position == combo3){
					flag3 = true; 
				}
			}else{
				position = (40 - (ticks - position));
				flag3 = false;
				if (position == combo3 ){
					flag3 = true;
				}
			}
		}
	}	
	
	public String openLock(){
		String lockPos = null;
		if (!(flag1 && flag2 && flag3)){			
			lockPos = "incorrect combination"; 
		}else{
			lockPos = "lock opened";
		}
		return lockPos;
	}
}

class Locker {
	
	private int combo1, combo2, combo3;
	private int turn1, turn2, turn3;
	int lockerNumber;
	private String studentName;	
	int numberOfBooks, BookStatus, bookAdd, bookRemove;
	CombinationLock combinationLock;
	
	public Locker(){
		
	}
	public Locker(int lockerNum, String name){

		this.lockerNumber = lockerNum;
		this.studentName = name; 
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int putBookInLocker(int addBook){
		int numbooks;
		numbooks = numberOfBooks + addBook;
		return numbooks;
	}
	public int removeBookFromLocker (int booksRemoved){
		int numbooks;
		numbooks = numberOfBooks - booksRemoved;
		return numbooks;
	}
	
	public void openLocker(){
		String lockStatus;
		
//		CombinationLock lock = new CombinationLock(35, 12, 37);
//		lock.turnRight(5);
//		lock.turnLeft(17);
//		lock.turnRight(15);
//		lockStatus = lock.openLock();
		
//		studentName = "Mickey Mouse";
//		lockerNumber = 100;
//		numberOfBooks = 3;
//		CombinationLock Mickey = new CombinationLock(28, 17, 39);
//		Mickey.turnRight(15);
//		Mickey.turnLeft(18);
//		Mickey.turnRight(18);
//		lockStatus = Mickey.openLock();
//		
//		studentName = "Donald Duck";
//		lockerNumber = 275;
//		numberOfBooks = 0;
//		CombinationLock Donald = new CombinationLock(35, 16, 27);
//		Donald.turnRight(5);
//		Donald.turnLeft(21);
//		Donald.turnRight(29);
//		lockStatus = Donald.openLock();		
				
		System.out.println("Please enter student name:");
		Scanner Student = new Scanner(System.in);
		studentName = Student.nextLine();
		System.out.println("Please enter locker number:");
		Scanner LockerNumber = new Scanner(System.in);
		lockerNumber = LockerNumber.nextInt();
		System.out.println("Please set 1st combination number:");
		Scanner combo = new Scanner(System.in);
		combo1 = combo.nextInt();
		System.out.println("Please set 2nd combination number:");
		combo = new Scanner(System.in);
		combo2 = combo.nextInt();
		System.out.println("Please set 3rd combination number:");
		combo = new Scanner(System.in);
		combo3 = combo.nextInt();
		System.out.println("Please enter number of books in Locker:");
		Scanner numBook = new Scanner(System.in);
		numberOfBooks = numBook.nextInt();
		System.out.println("Please enter right dial:");
		Scanner turn = new Scanner(System.in);
		turn1 = turn.nextInt();
		System.out.println("Please enter left dial:");
		turn = new Scanner(System.in);
		turn2 = turn.nextInt();
		System.out.println("Please enter right dial:");
		turn = new Scanner(System.in);
		turn3 = turn.nextInt();		
		
		CombinationLock lock = new CombinationLock(combo1, combo2, combo3);
		lock.turnRight(turn1);
		lock.turnLeft(turn2);
		lock.turnRight(turn3);
		lockStatus = lock.openLock();
		Locker BookAdd = new Locker();
		Locker BookRemove = new Locker();
		if (lockStatus == "lock opened"){
			Scanner ask = new Scanner(System.in);
			System.out.println("Would you like to add books?(y/n)");
			String Ask = ask.nextLine();
			if(Ask.contains("y")){
				System.out.println("How many do you want to add?");
				Scanner Add = new Scanner(System.in);
				bookAdd = Add.nextInt();				
				BookStatus = BookAdd.putBookInLocker(bookAdd);				
			}
			else{
				System.out.println("How many do you want to remove?");
				Scanner Remove = new Scanner(System.in);
				bookRemove = Remove.nextInt();				
				BookStatus = BookRemove.removeBookFromLocker(bookRemove);
				}
			System.out.println("you have " + BookStatus + "books in your locker");
		}
		else{
			System.out.println(lockStatus);
		}			
	}
}
