package Unit_3;


import java.util.*;
import java.text.*;


public class StockTracker {

	public static void main(String[] args) {
		
		System.out.println("Please enter the stock symbol you are monitoring:");
		Scanner StockSymbol = new Scanner(System.in);
		String stockSymbol = StockSymbol.nextLine();
		System.out.println("Please enter the associated Company name:");
		Scanner Company = new Scanner(System.in);
		String company = Company.nextLine();
		Stock stock = new Stock(stockSymbol, company);
		System.out.println("Please enter the previous closing price:");
		Scanner PreviousClose = new Scanner(System.in);
		double previousClose = PreviousClose.nextDouble();				
		stock.setPreviousClosingPrice(previousClose);
		System.out.println("Please enter the current price:");
		Scanner Current = new Scanner(System.in);
		double current = Current.nextDouble();
		stock.setCurrentPrice(current);

		System.out.println("The previous closing price for " + stockSymbol + " is: " + stock.getPreviousClosingPrice());
		System.out.println("The current price for " + stockSymbol + " is: " + stock.getCurrentPrice());
		System.out.println("The change in price is: " + stock.getChangePercent() * 100 + "%");
		
		StockSymbol.close();
		Company.close();
		PreviousClose.close();
		Current.close();
	}
}

class Stock {
	
	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;

	public Stock() {
	}

	public Stock(String newSymbol, String newName) {
		symbol = newSymbol;
		name = newName;
	}	
	public double getPreviousClosingPrice() {
		return previousClosingPrice;
	}
	public void setPreviousClosingPrice(double newPreviousClosingPrice) {
		previousClosingPrice = newPreviousClosingPrice;
	}
	public double getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(double newCurrentPrice) {
		currentPrice = newCurrentPrice;
	}
	public double getChangePercent() {
		return ((currentPrice - previousClosingPrice)/previousClosingPrice);
	}
}
