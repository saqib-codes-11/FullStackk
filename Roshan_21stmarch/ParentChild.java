class Parent {
    String name;
    void method()
    {
        System.out.println("this is Parent method");
    }
}



class Child extends Parent {
    int id;
    @Override void method()
    {
        System.out.println("this is Child method");
    }
}


public class ParentChild{
    public static void main(String[] args) {

        Parent p = new Child();
        p.name = "roshan";
        System.out.println(p.name);
        p.method();
        Child c = (Child)p;
        c.id = 359;
        System.out.println(c.name);
        System.out.println(c.id);
        c.method();


    }

}

