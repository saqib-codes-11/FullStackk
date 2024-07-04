package ArrayIndexOutOfBound;

public class ArrayIndexOutOfBoundException {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			try {
				int arr[]= {1,2,3,4,5};
				System.out.println(arr[15]);
			}
			catch(Exception g) {
				System.out.println(g);
				
			}

		}
}
