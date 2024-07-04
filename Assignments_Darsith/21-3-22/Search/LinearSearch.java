package Search;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,10,15,20,25,30,35,40,45,50};
		int target = 25;
		boolean flag = false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == target) {
				System.out.println("Found");
				flag = true;
			}
			
		}
		if(!flag) {
			System.out.println("Not Found");
		}

	}

}
