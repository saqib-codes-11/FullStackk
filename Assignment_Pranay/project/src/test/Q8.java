package test;

import java.util.Scanner;

class Document {
	private String emailText;

	public Document(String emailText) {
		this.emailText = emailText;
	}

	@Override
	public String toString() {
		return emailText;
	}
	
}

 class Email extends Document{
	private String sender;
	private String recipient;
	private String title;
	
	public Email(String text, String sender, String recipient, String title) {
		super(text);
		this.sender = sender;
		this.recipient = recipient;
		this.title = title;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String gettext() {
		return super.toString();
	}

	@Override
	public String toString() {
		return sender + recipient + title + gettext() ;
	}

	
	
}

public class Q8{
	static boolean ContainsKeyword(Document docObject, String keyword) {
		
		//if(docObject.toString().indexOf(keyword,0)>=0)
		if(docObject.toString().contains(keyword))
		{
			return true;
		}
		else return false;	
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("From:");
		String from=sc.nextLine();
		System.out.println("To:");
		String to=sc.nextLine();
		System.out.println("Title:");
		String subject=sc.nextLine();
		
		System.out.println("Mesage:");
		String msg=sc.nextLine();
		
		System.out.println("Search Keyword:");
		String search=sc.nextLine();
		
		Document email1=new Email(msg,from,to,subject);
		
		if (ContainsKeyword(email1, search)) {
			System.out.println("Email contains the word: "+search);
		}
		else {
		System.out.println("Email does not contain the word: "+search);
		}
		
		//System.out.println(email1.toString());
	}
}
