package exceptions;

public class NullTernary {
	public static void main(String[] args) {
		String str=null;
		//String str="Hello World";
		
		//String msg=str.substring(0,5);
		//System.out.println(msg);
		
		String msg= (str==null) ?"Object reference is null" :str.substring(0,5);
		
		//System.out.println(msg);
	}
}
