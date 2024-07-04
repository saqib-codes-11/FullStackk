import java.util.ArrayList;
 
public class PrintArrayListMain {
 
    public static void main(String[] args) {
        ArrayList<String> arl = new ArrayList<>();
 
        arl.add("Hyundai");
        arl.add("Kia");
        arl.add("Tesla");
        arl.add("MG");
 
        System.out.println("Elements of ArrayList are:");
        for (int i = 0; i < arl.size(); i++) {
            System.out.println(arl.get(i) + " ");
        }
    }
}