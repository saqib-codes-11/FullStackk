package jpa;


class IfDemo {
    public static void main(String  args[])
    {
           Sample2333  SampleObj23 = new Sample2333();
      //  System.out.println(SampleObj23.add()  );
       // System.out.println(SampleObj23.add(1,2)  );
        System.out.println(SampleObj23.add("Ramana SAI")  );
    }


}

class Sample2333
{
int a=90;
byte b= 89;

String name = "Rachana";
//non praprmeter
int add(){
   //comment
    String name = "sdfkgsdf";
   int c= 23+23;
   System.out.println("I am a non paramtereted and with rtetuurn value function");
   return c ;
};
    int add(int a, int b){
        //comment
        int c= a+b;
        System.out.println("I am parametered  nd with rtetuurn value function");
        return c;
    };
    boolean add(String str){
        //comment
        System.out.println("Hellow " +str  +"can you hear me ?");
        return false;
    };


}