package userdefinedexceptions;

public class BankDemo {
	public static void main(String[] args) {
		
		CheckingAccount c=new CheckingAccount(101);
		
		System.out.println("Depositing 1000");
		
		c.deposit(1000);
		
		try {
			System.out.println("Withdrawing 600");
			c.withdraw(600);
			
			System.out.println("Withdrawing 800");
			c.withdraw(800);
			
		} catch(InsusfficientFundsException e) {
			System.out.println("Insufficent Funds: You need :"+ e.getAmount());
//			e.printStackTrace();
		}
	}
}
