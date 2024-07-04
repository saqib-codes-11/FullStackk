package Abstractclass;
public abstract class Human {
	public abstract void eat();//only declaration should be done inside abstract class
	public void walk()
	{
		
	}

}
public class Man extends Human{
	public void eat() {//method defenition 
		System.out.println("in eat");
	}

}

public class AbstractDemoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human m=new Man();
		m.eat();

	}

}
