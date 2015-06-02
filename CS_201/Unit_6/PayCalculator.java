package Unit_6;

// Abstract class PayCalculator with attribute payRate given in dollars per hour.
public abstract class PayCalculator{	

	protected double payRate;	

	// Method computePay(hours), returns the pay for a given amount of time.
	public double computePay(int hours){
		
		return hours * payRate;
	}	
}

// Class RegularPay derived from PayCalculator
class RegularPay extends PayCalculator{

	// Has a constructor that has a parameter for the pay rate. Does not override any of the methods.
	public RegularPay(double payRate){
		
		this.payRate = payRate;
	}
}

// Class HazardPay derived from PayCalculator that overrides the computePay method.
class HazardPay extends RegularPay{

	// Has constructor
	public HazardPay(double payRate){
		
		super(payRate);
	}
	
	// computePay method returns amount returned by the base class method multiplied by 1.5.
	public double computePay(int hours){
		
		return hours*payRate*1.5;
	}
}

