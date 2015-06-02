package Unit_1;


import java.util.Random;

//this is supposed to randomly generate a direction based on the java util "Random" that assigns
//a direction to the number 1 through 4 (1=North etc)
//it then uses that in an incrementing while loop to add to the x & y coordinates 
//after incrementing 12 times (every 5 minutes in an hour) it outputs the coordinates

public class Unit1Problem4{
	
	public static void main(String[] args){
		int x = 0;
		int y = 0;
		int i = 0;
		randomDirectioner(1,4, x, y, i);
						
	}
	public static void randomDirectioner(int min, int max, int x, int y, int i){
		
		Random randomizer = new Random();
		int randomDirection = randomizer.nextInt((max - min) + 1) + min;				
		direction(randomDirection, x, y, i);
		
	}
	public static void direction(int randomDirection, int x, int y, int i){
		while(i<12){			
			i++;
			if (randomDirection == 1){
				//North
				y++;
				randomDirectioner(1, 4, x, y, i);				
			}
			if (randomDirection == 2){
				//South
				y--;
				randomDirectioner(1, 4, x, y, i);
			}
			if (randomDirection == 3){
				//East
				x++;
				randomDirectioner(1, 4, x, y, i);
			}
			if (randomDirection == 4){
				//West
				y--;
				randomDirectioner(1, 4, x, y, i);
			}			
		}		
		System.out.println("coordinates: "+x+","+y);
		double d = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
		System.out.println("distance: "+d);
	}
}