package ch3;


import java.util.*;
import java.text.*;

public class EquipmentGo{
	
	public static void main(String []args){
		
		Equipment computer, phone, pager, camera;

		computer = new EquipmentComputer(2.2, 324.99, "rechargeable battery", "home computing", "Samsung", "laptop");
		computer.displayMessage();
		System.out.println("\n");
		
		phone = new EquipmentPhone(.08, 69.00, "rechargeable battery", "communication","LG", "phone");
		phone.displayMessage();
		System.out.println("\n");
		
		pager = new EquipmentPager(.02, 499.00, "battery", "simple communication", "startac", "pager");
		pager.displayMessage();
		System.out.println("\n");
		
		camera = new EquipmentCamera(.5, 1200.00, "rechargeable battery", "taking photos", "nikon", "camera");			
		camera.displayMessage();
		System.out.println("\n");
	}
}