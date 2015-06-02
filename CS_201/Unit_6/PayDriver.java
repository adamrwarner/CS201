package Unit_6;


public class PayDriver{
	
	public static void main(String[] args)
	{
		RegularPay regularPay = new RegularPay(40);
		double RP = regularPay.computePay(40);
		HazardPay hazardPay = new HazardPay(6);
		double HP = +hazardPay.computePay(40);
		double totalPay = RP + HP;
		
		System.out.println(" Your regular pay for this period is: " + regularPay.computePay(40) + "0");
		
		
		System.out.println("\n Your hazard pay for this period is: " + hazardPay.computePay(40) + "0");
		
		
		System.out.println("\n Your total pay for this period is: " + totalPay + "0");
	}
}