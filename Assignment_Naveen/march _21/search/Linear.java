package assign;

public class Linear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {7,21,34,56,60,62,75,79,81};
		int key = 56;
		boolean flag = false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == key) {
				System.out.println("Found at index "+i);
				flag = true;
			}
			
		}
		if(!flag) {
			System.out.println("Not Found");
		}

		}
	}
