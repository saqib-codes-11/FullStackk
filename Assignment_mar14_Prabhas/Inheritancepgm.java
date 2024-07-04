package assignments1;
import java.util.*;
class car{
    String name;
    public void drive(){
        System.out.println("uses petrol");
    }
}
class xuv extends car{
    public void display(){
        System.out.println("car company is "+name);
    }
}

public class Inheritancepgm{
    public static void main(String args[]){
        xuv c = new xuv();
        c.name="audi";
      c.display();
        c.drive();
    }
}
