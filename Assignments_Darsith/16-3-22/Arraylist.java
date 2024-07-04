package Assignment3;
import java.util.ArrayList;

public class Arraylist {
	public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();
        System.out.println("Orginal List ");
        list.add("Abhay");
        list.add("Naveen");
        list.add("Deepak");
        list.add("Abhijith");
        list.add("Likhith");
        System.out.println(list);
        list.remove(0);
        list.remove(3);
        list.remove(1);
        System.out.println("After removing 3 elements ");
        System.out.println(list);
        list.clear();
        System.out.println("After Clearing ");
        System.out.println(list);
	}

}
