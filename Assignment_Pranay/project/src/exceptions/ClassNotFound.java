package exceptions;

public class ClassNotFound {
 
    public static void main(String args[])
    {
 
        try {
 
            Class.forName("className");
        }
 
        catch (ClassNotFoundException ex) {
        	System.out.println("Error: ClassNotFound");
            // Displaying exceptions on console along with line number using printStackTrace() method
            ex.printStackTrace();
        }
    }
}