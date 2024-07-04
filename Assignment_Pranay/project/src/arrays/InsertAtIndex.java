package arrays;

public class InsertAtIndex {
	public static void main(String[] args) {
		int[] focus= {3,6,8,4,1,5};
		
		int ind_pos=2;
		int value=7;
		
		for (int i=focus.length-1;i> ind_pos;i--)
		{
			focus[i]=focus[i-1];
		}
		
		focus[ind_pos]=value;
		for (int e:focus )
		{
			System.out.println(e);
		}
	}
}
