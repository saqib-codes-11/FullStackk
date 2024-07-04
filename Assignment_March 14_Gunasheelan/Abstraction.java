package Abstractclass;
public abstract class Human {
	public abstract void speak();//only declaration should be done inside abstract class
	public void walk()
	{
		
	}

}
public class Man extends Human{
	public void speak() {  //method defenition 
		System.out.println("Speaking");
	}

}

public class AbstractDemo {

	public static void main(String[] args) {
		Human m=new Man();
		m.speak();

	}

}
