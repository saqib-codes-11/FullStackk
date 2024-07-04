package project;

public class ThisExampleTest {
	public static void main(String[] args)
	{
		System.out.println(ThisExample.company);
		System.out.println();
		ThisExample e1=new ThisExample(1,"pranay");
		ThisExample e2=new ThisExample(2,"tara");
		
		System.out.println(e1.id);
		System.out.println(e2.name);
	}
}
