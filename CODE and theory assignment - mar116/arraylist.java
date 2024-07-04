import java.util.ArrayList;

public class arraylist {
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        System.out.print("Before removing:"+ list);
        list.remove(2);
        System.out.println("\nafter removing:");
        System.out.println(list);
        
        
    }
    
}
