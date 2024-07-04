package assignments1;

class Andrapradesh{
    public void andra(){
        System.out.println("printed Andrapradesh");
    }
}
class vizag extends Andrapradesh{
    public void viz(){
        System.out.println("printed vizag");
    }
}
class kurnool extends Andrapradesh{
    public void knl(){
        System.out.println("printed kurnool");
    }
}
public class polymorphismpgm{
    public static void main(String args[]){
        Andrapradesh a=new Andrapradesh();
        a.andra();
        vizag v=new vizag();
        v.viz();
         kurnool k= new kurnool();
         k.knl();
    }
}