package arrays;

public class TwoD {

	public static void main(String[] args) {
		int[][] prism= {{1,2,3},{4,5,6}};
		
		for (int i=0;i<prism.length;i++) {
			for (int j=0;j<prism[i].length;j++)
			{
				System.out.println(prism[i][j]);
			}
			System.out.println();
		}

	}

}
