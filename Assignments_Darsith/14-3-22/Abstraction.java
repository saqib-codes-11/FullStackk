package Assignment1;

public class Abstraction {
        public static void main(String[] args) {
                //maheshphone obj = new maheshphone();
                //obj.call();
                Sureshphone obj = new Sureshphone();
                obj.call();
                obj.dance();
                obj.move();
                obj.cook();

        }

abstract class maheshphone{              //abstract class
        public void call() {
                System.out.println("calling...");
        }

        public abstract void move();
        public abstract void dance();
        public abstract void cook();
}

abstract class Rameshphone extends maheshphone{    //abstract class
        public void move() {
                System.out.println("moving..");
        }
}

class Sureshphone extends Rameshphone{        //concrete class

        public void dance() {
                System.out.println("dancing..");

        }
        public void cook() {
                System.out.println("cooking..");
        }
}
	
}

