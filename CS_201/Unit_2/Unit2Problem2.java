package Unit_2;


import java.util.Scanner;

public class Unit2Problem2 {

	public static void main(String[] args) {
		
		inputValidDegreeOfDifficulty();			
	}
	private static float inputValidScore() {
		System.out.println("Please enter valid score:");
		Scanner JudgeInput = new Scanner(System.in);
		float judgeInput = JudgeInput.nextFloat();
		return judgeInput;		
	}
	private static void inputAllScores(float degreeOfDifficulty) {
		float[] judges = new float[7];
		for (int i = 0; i < judges.length; i++){
			judges[i] = inputValidScore();
		}
		calculateScore(judges, degreeOfDifficulty);
	}
	private static void inputValidDegreeOfDifficulty() {
		System.out.println("Please enter valid degree of difficulty:");
		Scanner DegreeOfDifficulty = new Scanner(System.in);
		float degreeOfDifficulty = DegreeOfDifficulty.nextFloat();		
		if (degreeOfDifficulty >= 1.2 & degreeOfDifficulty <= 3.8){
			inputAllScores(degreeOfDifficulty);
		}
		else {
			System.out.println("you entered an incorrect degree of difficulty (1.2 - 3.8)");
			inputValidDegreeOfDifficulty();
		}
	}
	private static void calculateScore(float[] judges, float degreeOfDifficulty) {	

		float max = judges[0];
		float min = judges[0];
		for (int i = 0; i< judges.length; i++){
			if (judges[i] > max) max = judges[i];
			if (judges[i] < min) min = judges[i];
		}
		float sum = 0;
		for (int i = 0; i < judges.length; i++) {
			sum += judges[i];
		}
		float degreeSum = (sum - max - min) * degreeOfDifficulty; 
		double total = degreeSum * 0.6;
		System.out.println("The divers score is: " + total);		
	}
}
