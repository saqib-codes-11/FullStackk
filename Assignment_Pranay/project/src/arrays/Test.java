package arrays;

public class Test {
	public static void main(String[] args) {
		int[] prism = new int[5];
		
		prism[0]=10;
		prism[1]=20;
		prism[2]=30;
		prism[3]=40;
		prism[4]=50;
		
		for (int element:prism)
		{
			System.out.println(element);
		}
		System.out.println();
		
		for (int i=0; i<prism.length; i++) {
			System.out.println(prism[i]);
		}
	}
}
