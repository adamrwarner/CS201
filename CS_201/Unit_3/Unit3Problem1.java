package Unit_3;


import java.util.*;
import java.text.*;

public class Unit3Problem1 {

	public static void main(String[] args) {		
		
		HouseConfig config1 = new HouseConfig();
		HouseConfig config2 = new HouseConfig("yellow", "hardwood", 1);
		HouseConfig config3 = new HouseConfig("purple", "tile", 0);
		HouseConfig config4 = new HouseConfig("white", "carpet", 3);
		
		System.out.println(config1);
		System.out.println(config2);
		System.out.println(config3);
		System.out.println(config4);
	}
}
class HouseConfig{
	
	private String walls;
	private String floor;
	private int windows = 0;
	
	public HouseConfig(){
		
		this("blue", "hardwood", 6);
	}
	public HouseConfig(String wallColor, String floorType, int windowNum){
		
		walls = wallColor;
		floor = floorType;
		windows = windowNum;
		
	}
	
	public String toString() {
        
		return ("This program is still messed up");
		//return String.format("The current room has %s walls, %s flooring and %d windows ", walls, floor, windows);
		
    }	
}
