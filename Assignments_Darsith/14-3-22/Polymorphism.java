package Assignment1;

public class Polymorphism {

        public static void main(String args[]) {

                Child c = new Child();
                c.A();
                c.B();
                c.C();
        }
}

class Parent {
        public void A() {
                System.out.println("Parent class A method");
        }
        public void B() {
                System.out.println("Parent class B method");
        }
}

class Child extends Parent{
        public void A() {
                System.out.println("Child class A method");
        }
        public void C() {
                System.out.println("Child class C method");
        }
}