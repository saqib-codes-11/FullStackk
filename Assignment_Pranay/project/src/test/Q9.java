package test;

import java.util.Scanner;

abstract class Payment{
	public abstract String paymentDetails();
}


class CashPayment extends Payment {
	private double amount;
	private String custname;
	public CashPayment(double amount, String custname) {
		super();
		this.amount = amount;
		this.custname = custname;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	
	public double payableAmount() {
		double discount = 0.02 * amount;
		
		return amount- discount;	
	}
	
	
	@Override
	public String paymentDetails() {
		double totalAmount= payableAmount();
		return "Cash Payment: " +totalAmount + "\tCustomer name: "+custname;
	}
	
}

class CreditCardPayment extends Payment {
	private double amount;
	private String name;
	private String expiry;
	private String cardNumber;
	public CreditCardPayment(double amount, String name, String expiry, String cardNumber) {
		super();
		this.amount = amount;
		this.name = name;
		this.expiry = expiry;
		this.cardNumber = cardNumber;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getExpiry() {
		return expiry;
	}
	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	public double payableAmount() {
		double discount = 0.05 * amount;
		
		return amount- discount;	
	}
	
	@Override
	public String paymentDetails() {
		double totalAmount= payableAmount();
		return "Card Payment: " +totalAmount + "\tCard Number: "+cardNumber + "\tExpiry Date: "+expiry;
	}
	
	
}


public class Q9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		
		if(choice==1) {
			double amount=sc.nextDouble();
			String name=sc.next();
			String expDate=sc.next();
			String card=sc.next();
			
			CreditCardPayment credit = new CreditCardPayment(amount, name, expDate, card);
			System.out.println(credit.paymentDetails());
		}
		
		else if(choice==2) {
			double amount=sc.nextDouble();
			String name=sc.next();
			
			CashPayment cash = new CashPayment(amount, name);
			System.out.println(cash.paymentDetails());
			
		}
	}
}
