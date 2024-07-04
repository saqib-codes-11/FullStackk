package userdefinedexceptions;
//extends RunTimeException b 
public class InsusfficientFundsException extends Exception {
	private double amount;
	
	public InsusfficientFundsException(double amount)
	{
		this.amount=amount;
		
	}
	
	public double getAmount()
	{
		return amount;
	}
	
	 public String toString() { return "Amount required is: " +amount; }
}
