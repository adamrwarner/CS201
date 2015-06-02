package Unit_1;


import java.util.Scanner;

//algorithm pseudo-code:
//first display current computer configuration of price
//ask if the user wants to upgrade anything with y/n user input
//if y, walk user through adding indivual upgrades to their configuration
//when finished, display final price with configuration


public class Unit1Problem1{			
	
	public static void main(String [] args){
		
		double processor = 2.5;
		String processorSpeed = processor + "GHz";
		int memory = 4;
		String memorySize = memory + "GB";
		int hardDrive = 500;
		String hardDriveSize = hardDrive + "GB";
		String audioCard = "Intel High Definition Audio";	
		String videoCard = "Intel Iris Graphics";	
		String speakers = "internal speakers";	
		double basePrice = 1099.99;		

		//here is the config page of the base computer selected: http://store.apple.com/us/buy-mac/macbook-pro?product=MGX92LL/A&step=config#
		totals(processorSpeed, memorySize, hardDriveSize, audioCard, videoCard, speakers, basePrice);
		
	}
	
	private static void upgrader(double price) {
		
		double processor = 2.8;
		String processorSpeed = processor + "GHz";
		int memory = 16;
		String memorySize = memory + "GB";
		int hardDrive = 1;
		String hardDriveSize = hardDrive + "TB";
		String audioCard = "Intel 5.1 Surround Audio";	
		String videoCard = "NVIDIA GeForce GT 750M with 2GB GDDR5 memory";	
		String speakers = "Harman Kardon SoundSticks III 2.1 Channel Sound System";	
		
		System.out.println("Which items would you like to upgrade?");
		System.out.println("Enter 'processor', 'memory', 'hard drive', 'audio card', 'video card', 'speakers' or 'none'");
		Scanner upgradeItem = new Scanner(System.in);
		String upgrade_Item = upgradeItem.nextLine();
		
		if(upgrade_Item.equals("processor")){
			System.out.println("Your upgrade option for the processor is a " + processorSpeed + "processor");
			System.out.println("this upgrade will cost and additional $150.00");
			System.out.println("Would you like to add this upgrade(y/n)?");
			Scanner decision = new Scanner(System.in);
			String Decision = upgradeItem.nextLine();
			if(Decision.equals("y")){
				price = price + 150;
				upgrader(price);
			}
			else if(Decision.equals("n")){
				System.out.println("Do you want to upgrade anything else(y/n)?");
				Scanner decide = new Scanner(System.in);
				String Decide = decide.nextLine();
				if(Decide.equals("y")){
					upgrader(price);
				}
				else{					
					totals(processorSpeed, memorySize, hardDriveSize, audioCard, videoCard, speakers, price);
				}
				decide.close();
			}
			decision.close();
		}
		if(upgrade_Item.equals("memory")){
			System.out.println("Your upgrade option for the memory is " + memorySize + "of RAM");
			System.out.println("this upgrade will cost and additional $100.00");
			System.out.println("Would you like to add this upgrade(y/n)?");
			Scanner decision = new Scanner(System.in);
			String Decision = upgradeItem.nextLine();
			if(Decision.equals("y")){
				price = price + 100;
				upgrader(price);
			}
			else if(Decision.equals("n")){
				System.out.println("Do you want to upgrade anything else(y/n)?");
				Scanner decide = new Scanner(System.in);
				String Decide = decide.nextLine();
				if(Decide.equals("y")){
					upgrader(price);
				}
				else{					
					totals(processorSpeed, memorySize, hardDriveSize, audioCard, videoCard, speakers, price);
				}
				decide.close();
			}
			decision.close();
		}
		if(upgrade_Item.equals("hard drive")){
			System.out.println("Your upgrade option for the hard drive is " + hardDriveSize + "of disk space");
			System.out.println("this upgrade will cost and additional $150.00");
			System.out.println("Would you like to add this upgrade(y/n)?");
			Scanner decision = new Scanner(System.in);
			String Decision = upgradeItem.nextLine();
			if(Decision.equals("y")){
				price = price + 150;
				upgrader(price);
			}
			else if(Decision.equals("n")){
				System.out.println("Do you want to upgrade anything else(y/n)?");
				Scanner decide = new Scanner(System.in);
				String Decide = decide.nextLine();
				if(Decide.equals("y")){
					upgrader(price);
				}
				else{					
					totals(processorSpeed, memorySize, hardDriveSize, audioCard, videoCard, speakers, price);
				}
				decide.close();
			}
			decision.close();
		}
		if(upgrade_Item.equals("audio card")){
			System.out.println("Your upgrade option for the audio card is " + audioCard);
			System.out.println("this upgrade will cost and additional $100.00");
			System.out.println("Would you like to add this upgrade(y/n)?");
			Scanner decision = new Scanner(System.in);
			String Decision = upgradeItem.nextLine();
			if(Decision.equals("y")){
				price = price + 100;
				upgrader(price);
			}
			else if(Decision.equals("n")){
				System.out.println("Do you want to upgrade anything else(y/n)?");
				Scanner decide = new Scanner(System.in);
				String Decide = decide.nextLine();
				if(Decide.equals("y")){
					upgrader(price);
				}
				else{					
					totals(processorSpeed, memorySize, hardDriveSize, audioCard, videoCard, speakers, price);
				}
				decide.close();
			}
			decision.close();
		}
		if(upgrade_Item.equals("video card")){
			System.out.println("Your upgrade option for the video card is " + videoCard);
			System.out.println("this upgrade will cost and additional $100.00");
			System.out.println("Would you like to add this upgrade(y/n)?");
			Scanner decision = new Scanner(System.in);
			String Decision = upgradeItem.nextLine();
			if(Decision.equals("y")){
				price = price + 100;
				upgrader(price);
			}
			else if(Decision.equals("n")){
				System.out.println("Do you want to upgrade anything else(y/n)?");
				Scanner decide = new Scanner(System.in);
				String Decide = decide.nextLine();
				if(Decide.equals("y")){
					upgrader(price);
				}
				else{					
					totals(processorSpeed, memorySize, hardDriveSize, audioCard, videoCard, speakers, price);
				}
				decide.close();
			}
			decision.close();
		}
		if(upgrade_Item.equals("speakers")){
			System.out.println("Your upgrade option for the speakers is " + speakers);
			System.out.println("this upgrade will cost and additional $300.00");
			System.out.println("Would you like to add this upgrade(y/n)?");
			Scanner decision = new Scanner(System.in);
			String Decision = upgradeItem.nextLine();
			if(Decision.equals("y")){
				price = price + 300;
				upgrader(price);
			}
			else if(Decision.equals("n")){
				System.out.println("Do you want to upgrade anything else(y/n)?");
				Scanner decide = new Scanner(System.in);
				String Decide = decide.nextLine();
				if(Decide.equals("y")){
					upgrader(price);
				}
				else{					
					totals(processorSpeed, memorySize, hardDriveSize, audioCard, videoCard, speakers, price);
				}
				decide.close();
			}
			decision.close();
		}
		if(upgrade_Item.equals("none")){
			totals(processorSpeed, memorySize, hardDriveSize, audioCard, videoCard, speakers, price);
		}
		totals(processorSpeed, memorySize, hardDriveSize, audioCard, videoCard, speakers, price);
		upgradeItem.close();
	}

	public static void totals(String processorSpeed, String memorySize, String hardDriveSize, String audioCard, String videoCard, String speakers, double price){
		
		System.out.println("Here is the base configuration of your computer:");
		System.out.println("----------------------------------------------");
		System.out.println("displaying your current configuration & totals");
		System.out.println("----------------------------------------------");
		
		System.out.println("The Processor that you chose: "+ processorSpeed);
		System.out.println("The RAM that you chose: "+ memorySize);
		System.out.println("The Harddrive that you chose: "+ hardDriveSize);
		System.out.println("The Audio Card that you chose: "+ audioCard);
		System.out.println("The Video Card that you chose: "+ videoCard);
		System.out.println("The Speakers that you chose: "+ speakers);
		System.out.print("Your total cost is: $" + price + "\n");
		System.out.println("------------------------------------------------------------");
		System.out.println("Would you like to upgrade anything or change anything (y/n)?");
		System.out.println("------------------------------------------------------------");
		Scanner upgrade = new Scanner(System.in);
		String Upgrade = upgrade.nextLine();
		if(Upgrade.equals("y")){
			upgrader(price);
		}
		else if(Upgrade.equals("n")){
			System.out.println("Goodbye");
			System.exit(0);
		}					
	}
}