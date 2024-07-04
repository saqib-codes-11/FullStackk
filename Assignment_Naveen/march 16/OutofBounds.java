package assignments;

public class OutofBounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] a = {12,432,26,1124};
			System.out.println(a[10]);
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("out of bound");
		}
	}

}
