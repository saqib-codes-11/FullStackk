class Area{
    int length;
    int breadth;
    Area(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public void getArea(){
        int area=length*breadth;
        System.out.println("area: "+area);
    }
}
public class EncapsulationExample {
    public static void main(String args[]){
        Area a=new Area(5,6);
                a.getArea();
    }
}
