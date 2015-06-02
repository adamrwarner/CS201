package Unit_2;


import java.util.Scanner;

//initialize and array and take the user input for length of array 
//number of girls in troop = length of array
//for loop cycles through array accepting user input for boxes sold for each girl (number = position in array)
//us if statements to sort and total boxes sold count in an array 


public class Unit2Problem1 {

	public static void main(String[] args) {
				
		System.out.println("Please enter the number of boxes sold for each girl in the troop: ");
		Scanner TroopSize = new Scanner(System.in);
		int Troopsize = TroopSize.nextInt();
		int[] troopSize = new int[Troopsize];
		int[] range = new int[5];		
		
		for (int i = 0; i<Troopsize; i++){
			int girlNum = i + 1;
			System.out.println("Please enter the boxes sold for girl number " + girlNum + ":");
			Scanner BoxesSold = new Scanner(System.in);
			int boxesSold = BoxesSold.nextInt();
			troopSize[i] = boxesSold;
			if (boxesSold < 11){
				range[0]++;
			}
			if (boxesSold > 10 & boxesSold < 21){
				range[1]++;
			}
			if (boxesSold > 20 & boxesSold < 31){
				range[2]++;
			}
			if (boxesSold > 30 & boxesSold < 41){
				range[3]++;
			}
			if (boxesSold > 40){
				range[4]++;
			}
		}
				
		System.out.println("Total Boxes     | Number of Girl Scouts");
		System.out.println("+++++++++++++++++++++++++++++++++++++++");
		System.out.println(" 0 to 10 Boxes  |      " + range[0]);
		System.out.println("11 to 20 Boxes  |      " + range[1]);
		System.out.println("21 to 30 Boxes  |      " + range[2]);
		System.out.println("31 to 40 Boxes  |      " + range[3]);
		System.out.println("41 or more Boxes|      " + range[4]);
		System.out.println("+++++++++++++++++++++++++++++++++++++++\n");

	}

}
