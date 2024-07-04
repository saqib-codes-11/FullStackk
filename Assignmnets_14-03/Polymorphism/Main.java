package com.company.aneesh;



class Bike{
    void run(){System.out.println("running");}
}
class Splendor extends Bike{
    void run(){System.out.println("running safely with 60km");}

}
public class Main {

    public static void main(String[] args) {
        // write your code here
        Bike b = new Splendor();//upcasting
        b.run();
    }

}
