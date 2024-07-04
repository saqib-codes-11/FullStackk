package com.company.aneesh;
abstract class Bike{
    abstract void run();
}
class Honda4 extends Bike{
    void run()  {
        System.out.println("running safely");
    }
    }
public  class Main {

        public static void main(String[] args) {
	// write your code here
            Bike obj = new Honda4();
            obj.run();


        }
}
