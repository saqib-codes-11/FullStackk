abstract class Car{
    abstract void accelerate();
}
class Suzuki extends Car{
    void accelerate(){
        System.out.println("Suzuki");
    }
}
class AbstractionExample {
    public static void main(String args[]){ 
           Car obj = new Suzuki();
           obj.accelerate();
    }
}
