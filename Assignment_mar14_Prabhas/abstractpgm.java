package assignments1;

abstract class bike{
    abstract void track();
}
class honda extends bike{
    void track(){
        System.out.println("Honda");
    }
}
class abstractpgm {
    public static void main(String args[]){
           bike obj = new honda();
           obj.track();
    }
}

