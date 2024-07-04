package Assignment1;
public class Inheritance {
	public static void main(String [] args) {
		Car v1 = new Car();
        v1.name = "abc";
        v1.getname();

        Bike v2 = new Bike();
        v2.name = "xyz";
        v2.getname();

        Bus v3 = new Bus();
        v3.name = "lmn";
        v3.getname();
        }
}

class Vehicle {
	String name;

    public void getname() {
    	System.out.println("Name : "+name);
        }
}

class Car extends Vehicle{
}
class Bike extends Vehicle{
}
class Bus extends Vehicle{
}
