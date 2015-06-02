package Unit_2;


import java.util.*;
import java.text.*;

public class Unit2Problem3 {

	public static void main(String[] args) {		
		
		inputTempForYear();
	
	}
	
	public static void inputTempForYear(){
		Calculations calc = new Calculations();
		double[][] calendarTemps = new double[2][12];
		int i = 0;
		int j = 0;
		int temp = 0;
		Scanner tempInput = new Scanner(System.in);
		for (i = 0; i < calendarTemps.length; i++){
			for (j = 0; j < calendarTemps[i].length; j++){
			String entryTemp = null;
			String monthName = null;
			if(i == 0){
				entryTemp = "High";
			}
			if(i == 1){
				entryTemp = "Low";
			}
			if(j == 0){
				monthName = "January";
			}
			if(j == 1){
				monthName = "February";
			}
			if(j == 2){
				monthName = "March";
			}
			if(j == 3){
				monthName = "April";
			}
			if(j == 4){
				monthName = "May";
			}
			if(j == 5){
				monthName = "June";
			}
			if(j == 6){
				monthName = "July";
			}
			if(j == 7){
				monthName = "August";
			}
			if(j == 8){
				monthName = "September";
			}
			if(j == 9){
				monthName = "October";
			}
			if(j == 10){
				monthName = "November";
			}
			if(j == 11){
				monthName = "December";
			}
			System.out.println("Please input the " + entryTemp + " temperature for " + monthName );
			temp = tempInput.nextInt();
			calendarTemps[i][j] = temp;
			}
		}
		double avgHTemp = calc.calculateAverageHigh(calendarTemps);
		double avgLTemp = calc.calculateAverageLow(calendarTemps);
		double HTemp = calc.findHighestTemp(calendarTemps);
		double LTemp = calc.findLowestTemp(calendarTemps);
		System.out.println("Average high temperatures of the year is: " + avgHTemp );
		System.out.println("Average low temperatures of the year is: " + avgLTemp );
		System.out.println("The highest temperatures of the year is: " + HTemp );
		System.out.println("the lowest temperatures of the year is: " + LTemp );
		tempInput.close();
	}
	public static void inputTempForMonth(){
		//
	}
}
class Calculations{

	public double calculateAverageHigh(double[][] avgHigh){
		
		int i = 0;
		double sumHTemp = 0;
		double avgHTemp = 0;
		for (i=0; i < avgHigh[0].length; i++){
			sumHTemp = sumHTemp + avgHigh[0][i];
		}
		avgHTemp = (sumHTemp/avgHigh[0].length);
		return avgHTemp; 
	}
	public double calculateAverageLow(double[][] avgLow){
		int i = 0;
		double sumLTemp = 0;
		double avgLTemp = 0;
		for (i=0; i < avgLow[1].length; i++){
			sumLTemp += avgLow[1][i];
		}
		avgLTemp = (sumLTemp/avgLow[1].length);
		return avgLTemp;
     }
	public double findHighestTemp(double[][] findHighest){

		double findHighestT = findHighest[0][0];
		
		for (int i=0; i < findHighest.length; i++){
			for (int j=0; j < findHighest[1].length; j++){
				if (findHighest[i][j] > findHighestT){
					findHighestT = findHighest[i][j];
				}
			}
		}
		return findHighestT;
	}
	
	public double findLowestTemp (double[][] findLowest){
		
		double findLowestT = findLowest[0][0];
		for (int i=0; i < findLowest.length; i++){
			for (int j=0; j < findLowest[1].length; j++){
				if (findLowest[i][j] < findLowestT){
					findLowestT = findLowest[i][j];
				}
			}
		}
		return findLowestT;
	}
}
