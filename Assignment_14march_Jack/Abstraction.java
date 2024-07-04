package Abstractclass;
public abstract class Human {
	public abstract void sleep();//only declaration should be done inside abstract class
	public void walk()
	{
		
	}

}
public class Man extends Human{
	public void sleep() {//method defenition 
		System.out.println("sleeping");
	}

}

public class AbstractDemoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human m=new Man();
		m.sleep();

	}

}
