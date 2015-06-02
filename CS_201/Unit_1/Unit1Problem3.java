package Unit_1;


import java.util.Scanner;
import java.text.DecimalFormat;

//This program will offer selections with prices
//then prompt the user to input money
//it will then process the money and output the number of 
//coins the user will receive

public class Unit1Problem3{
	
	public static void main(String[] args){
	
	//add while loop where x < 6 to limit number of selections	
	System.out.println("Here are your choices");
	System.out.println("[1] costs $1.00");
	System.out.println("[2] costs $1.35");
	System.out.println("[3] costs $1.50");
	System.out.println("[4] costs $2.25");
	System.out.println("[5] costs $4.70");
	System.out.println("[0] to exit");
	double quarter = .25;
	int quarters = 0;
	double dime = .1;
	int dimes = 0;
	double nickel = .05;
	int nickels = 0;
	double penny = .01;
	int pennies = 0;	
	
	System.out.println("Please insert money");
	Scanner Funds = new Scanner(System.in);
	double funds = Funds.nextDouble();
	
	System.out.println("Please make your selection [1..5] or [0] to exit");
	Scanner Selection = new Scanner(System.in);
	int selection = Selection.nextInt();
	double cost = 0;
	if(selection == 0){
		System.out.println("Goodbye");
		System.exit(0);
	}
	if(selection == 1){
		cost = 1.00;		
		DecimalFormat df = new DecimalFormat("###.##");
		if(funds < cost){
			while(funds < cost){
				cost = (cost - funds);
				System.out.println("you owe $"+cost);
				System.out.println("Please insert $"+cost);
				funds = Funds.nextDouble();
			}
		}
		if(funds > cost){
			funds = funds - cost;
			System.out.println("you are owed $"+df.format(funds));
			while(funds > 0){
				double quarterNum = funds / quarter;
				double dimeNum = funds / dime;
				double nickelNum = funds / nickel;
				double pennyNum = funds / penny;
				double coinNum = 0;
				if(quarterNum < dimeNum && quarterNum < nickelNum && quarterNum < pennyNum){
					coinNum = quarterNum;
					funds = funds - (quarterNum*quarter);
					System.out.println("you are getting "+df.format(coinNum)+" quarters");	
				}
				if(dimeNum < quarterNum && dimeNum < nickelNum && dimeNum < pennyNum){
					coinNum = dimeNum;
					funds = funds - (dimeNum*quarter);
					System.out.println("you are getting "+df.format(coinNum)+" dimes");	
				}
				if(nickelNum < quarterNum && nickelNum < dimeNum && nickelNum < pennyNum){
					coinNum = nickelNum;
					funds = funds - (nickelNum*quarter);
					System.out.println("you are getting "+df.format(coinNum)+" nickels");	
				}
				if(pennyNum < quarterNum && pennyNum < nickelNum && pennyNum < dimeNum){
					coinNum = pennyNum;
					funds = funds - (pennyNum*quarter);
					System.out.println("you are getting "+df.format(coinNum)+" pennies");	
				}
			}
		}
	}
	if(selection == 2){
		cost = 1.35;		
		DecimalFormat df = new DecimalFormat("###.##");
		if(funds < cost){
			while(funds < cost){
				cost = (cost - funds);
				System.out.println("you owe $"+cost);
				System.out.println("Please insert $"+cost);
				funds = Funds.nextDouble();
			}
		}
		if(funds > cost){
			funds = funds - cost;
			System.out.println("you are owed $"+df.format(funds));
			while(funds > 0){
				double quarterNum = funds / quarter;
				double dimeNum = funds / dime;
				double nickelNum = funds / nickel;
				double pennyNum = funds / penny;
				double coinNum = 0;
				if(quarterNum < dimeNum && quarterNum < nickelNum && quarterNum < pennyNum){
					coinNum = quarterNum;
					funds = funds - (quarterNum*quarter);
					System.out.println("you are getting "+df.format(coinNum)+" quarters");	
				}
				if(dimeNum < quarterNum && dimeNum < nickelNum && dimeNum < pennyNum){
					coinNum = dimeNum;
					funds = funds - (dimeNum*quarter);
					System.out.println("you are getting "+df.format(coinNum)+" dimes");	
				}
				if(nickelNum < quarterNum && nickelNum < dimeNum && nickelNum < pennyNum){
					coinNum = nickelNum;
					funds = funds - (nickelNum*quarter);
					System.out.println("you are getting "+df.format(coinNum)+" nickels");	
				}
				if(pennyNum < quarterNum && pennyNum < nickelNum && pennyNum < dimeNum){
					coinNum = pennyNum;
					funds = funds - (pennyNum*quarter);
					System.out.println("you are getting "+df.format(coinNum)+" pennies");	
				}
			}
		}
	}
	if(selection == 3){
		cost = 1.50;		
		DecimalFormat df = new DecimalFormat("###.##");
		if(funds < cost){
			while(funds < cost){
				cost = (cost - funds);
				System.out.println("you owe $"+cost);
				System.out.println("Please insert $"+cost);
				funds = Funds.nextDouble();
			}
		}
		if(funds > cost){
			funds = funds - cost;
			System.out.println("you are owed $"+df.format(funds));
			while(funds > 0){
				double quarterNum = funds / quarter;
				double dimeNum = funds / dime;
				double nickelNum = funds / nickel;
				double pennyNum = funds / penny;
				double coinNum = 0;
				if(quarterNum < dimeNum && quarterNum < nickelNum && quarterNum < pennyNum){
					coinNum = quarterNum;
					funds = funds - (quarterNum*quarter);
					System.out.println("you are getting "+df.format(coinNum)+" quarters");	
				}
				if(dimeNum < quarterNum && dimeNum < nickelNum && dimeNum < pennyNum){
					coinNum = dimeNum;
					funds = funds - (dimeNum*quarter);
					System.out.println("you are getting "+df.format(coinNum)+" dimes");	
				}
				if(nickelNum < quarterNum && nickelNum < dimeNum && nickelNum < pennyNum){
					coinNum = nickelNum;
					funds = funds - (nickelNum*quarter);
					System.out.println("you are getting "+df.format(coinNum)+" nickels");	
				}
				if(pennyNum < quarterNum && pennyNum < nickelNum && pennyNum < dimeNum){
					coinNum = pennyNum;
					funds = funds - (pennyNum*quarter);
					System.out.println("you are getting "+df.format(coinNum)+" pennies");	
				}
			}
		}
	}
	if(selection == 4){
		cost = 2.25;		
		DecimalFormat df = new DecimalFormat("###.##");
		if(funds < cost){
			while(funds < cost){
				cost = (cost - funds);
				System.out.println("you owe $"+cost);
				System.out.println("Please insert $"+cost);
				funds = Funds.nextDouble();
			}
		}
		if(funds > cost){
			funds = funds - cost;
			System.out.println("you are owed $"+df.format(funds));
			while(funds > 0){
				double quarterNum = funds / quarter;
				double dimeNum = funds / dime;
				double nickelNum = funds / nickel;
				double pennyNum = funds / penny;
				double coinNum = 0;
				if(quarterNum < dimeNum && quarterNum < nickelNum && quarterNum < pennyNum){
					coinNum = quarterNum;
					funds = funds - (quarterNum*quarter);
					System.out.println("you are getting "+df.format(coinNum)+" quarters");	
				}
				if(dimeNum < quarterNum && dimeNum < nickelNum && dimeNum < pennyNum){
					coinNum = dimeNum;
					funds = funds - (dimeNum*quarter);
					System.out.println("you are getting "+df.format(coinNum)+" dimes");	
				}
				if(nickelNum < quarterNum && nickelNum < dimeNum && nickelNum < pennyNum){
					coinNum = nickelNum;
					funds = funds - (nickelNum*quarter);
					System.out.println("you are getting "+df.format(coinNum)+" nickels");	
				}
				if(pennyNum < quarterNum && pennyNum < nickelNum && pennyNum < dimeNum){
					coinNum = pennyNum;
					funds = funds - (pennyNum*quarter);
					System.out.println("you are getting "+df.format(coinNum)+" pennies");	
				}
			}
		}
	}
	if(selection == 5){
		cost = 4.70;		
		DecimalFormat df = new DecimalFormat("###.##");
		if(funds < cost){
			while(funds < cost){
				cost = (cost - funds);
				System.out.println("you owe $"+cost);
				System.out.println("Please insert $"+cost);
				funds = Funds.nextDouble();
			}
		}
		if(funds > cost){
			funds = funds - cost;
			System.out.println("you are owed $"+df.format(funds));
			while(funds > 0){
				double quarterNum = funds / quarter;
				double dimeNum = funds / dime;
				double nickelNum = funds / nickel;
				double pennyNum = funds / penny;
				double coinNum = 0;
				if(quarterNum < dimeNum && quarterNum < nickelNum && quarterNum < pennyNum){
					coinNum = quarterNum;
					funds = funds - (quarterNum*quarter);
					System.out.println("you are getting "+df.format(coinNum)+" quarters");	
				}
				if(dimeNum < quarterNum && dimeNum < nickelNum && dimeNum < pennyNum){
					coinNum = dimeNum;
					funds = funds - (dimeNum*quarter);
					System.out.println("you are getting "+df.format(coinNum)+" dimes");	
				}
				if(nickelNum < quarterNum && nickelNum < dimeNum && nickelNum < pennyNum){
					coinNum = nickelNum;
					funds = funds - (nickelNum*quarter);
					System.out.println("you are getting "+df.format(coinNum)+" nickels");	
				}
				if(pennyNum < quarterNum && pennyNum < nickelNum && pennyNum < dimeNum){
					coinNum = pennyNum;
					funds = funds - (pennyNum*quarter);
					System.out.println("you are getting "+df.format(coinNum)+" pennies");	
				}
			}
		}
	}
	System.out.println("enjoy your selection!");
	Funds.close();
	Selection.close();
	}
}