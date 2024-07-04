package assignments;
import java.util.ArrayList;
public class ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("audi");
		cars.add("bmw");
		cars.add("ford");
		cars.add("toyota");
		
		System.out.println(cars);
		cars.remove(2);
		System.out.println(cars);
		
	}

}
