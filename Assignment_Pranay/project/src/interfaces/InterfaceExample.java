package interfaces;

//Outline of the class
//We wanted to create a water bottle but we didnt know how
interface WaterBottle{
	String color="blue";
	void fillUp();
}
public class InterfaceExample implements WaterBottle {
	public static void main(String[] args) {
		InterfaceExample ex=new InterfaceExample();
		System.out.println(color);
		
		ex.fillUp();
	}

	//Have to add this method since its in the interface
	public void fillUp() {
		// TODO Auto-generated method stub
		System.out.println("Bottle is Filled Up!");
		
	} 
}
