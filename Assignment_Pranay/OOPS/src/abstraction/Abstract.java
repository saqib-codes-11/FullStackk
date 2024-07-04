package abstraction;

/*
 * Cant have any implemented methods inside an interface but can be done in abstract classs
 * An interface assumes all are abstract(unimplemented)
interface DogInterface {
	//Cant do this
	public void bark()
	{
		System.out.println("Bark");
	}
	
	void bark();
	public abstract void poop();
}

class Chihuahua implements Dog
*/

//Help us organize and we know what the dog do
abstract class Dog 
{
	public void bark()
	{
		System.out.println("Woof!");
	}
	//The method has to be present
	//It is an idea, abstract, it has to have this method but doesent know what to do with it
	public abstract void poop();
}

class Chihuahua extends Dog
{
	public void poop()
	{
		System.out.println("Dog pooped!");
	}
}



public class Abstract {
	public static void main(String[] args) {
		Chihuahua c=new Chihuahua();
		
		c.bark();
		
		c.poop();
	}

}
