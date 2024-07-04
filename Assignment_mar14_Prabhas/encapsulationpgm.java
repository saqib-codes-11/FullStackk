package assignments1;

class area{
    int l;
    int b;
    area(int length,int breadth){
        this.l=length;
        this.b=breadth;
    }
    public void getarea(){
        int area=l*b;
        System.out.println("area: "+area);
    }
}
public class encapsulationpgm{
    public static void main(String args[]){
        area a=new area(5,6);
                a.getarea();
    }
}