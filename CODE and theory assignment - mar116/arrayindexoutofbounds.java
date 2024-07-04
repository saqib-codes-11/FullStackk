
public class arrayindexoutofbounds{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int arr[]= {1,2,3,4,5};
			System.out.println(arr[6]);
		}
		 
		catch(Exception e) {
			System.out.println(e);
			
		}

	}

}