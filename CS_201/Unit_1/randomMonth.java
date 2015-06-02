package Unit_1;


import java.util.Random;

public class randomMonth {

	public static void main() {
		
		randomMonther(1,12);
	
	}
	public static void randomMonther(int min, int max){
		
		Random randomizer = new Random();
		int randomMonthNum = randomizer.nextInt((max - min) + 1) + min;				
		monthName(randomMonthNum);
		
	}
	public static void monthName(int randomMonthNum){
		if (randomMonthNum == 1){
			System.out.println("January");
		}
		if (randomMonthNum == 2){
			System.out.println("February");
		}
		if (randomMonthNum == 3){
			System.out.println("March");
		}
		if (randomMonthNum == 4){
			System.out.println("April");
		}
		if (randomMonthNum == 5){
			System.out.println("May");
		}
		if (randomMonthNum == 6){
			System.out.println("June");
		}
		if (randomMonthNum == 7){
			System.out.println("July");
		}
		if (randomMonthNum == 8){
			System.out.println("August");
		}
		if (randomMonthNum == 9){
			System.out.println("September");
		}
		if (randomMonthNum == 10){
			System.out.println("October");
		}
		if (randomMonthNum == 11){
			System.out.println("November");
		}
		if (randomMonthNum == 12){
			System.out.println("December");
		}
	}

}
