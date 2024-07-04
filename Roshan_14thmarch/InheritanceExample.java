class Animal{
    String name;
    public void eat(){
        System.out.println("I can eat");
    }
}
class Dog extends Animal{
    public void display(){
        System.out.println("my name is "+name);
    }
}

public class InheritanceExample {
    public static void main(String args[]){
        Dog lab = new Dog();
        lab.name="ronu";
        lab.display();
        lab.eat();
    }
}
