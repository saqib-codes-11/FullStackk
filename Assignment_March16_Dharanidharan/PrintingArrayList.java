package CapgeminiTraining;
import java.util.ArrayList;

public class PrintingArrayList {
	   public static void main(String[] args) {
	        ArrayList<String> arl = new ArrayList<>();
	        //Adding the elements to the arraylist
	        arl.add("Hyundai");
	        arl.add("Kia");
	        arl.add("Tesla");
	        arl.add("MG");
	        //printing the elements of Arraylist
	        System.out.println("Elements of ArrayList are:");
	        for (int i = 0; i < arl.size(); i++) {
	            System.out.println(arl.get(i) + " ");
	        }	
	}
}
