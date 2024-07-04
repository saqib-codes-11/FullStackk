package Search;

public class Binary {
	
	 public static void binarySearch(int arr[], int first, int last, int key){  
		   int mid = (first + last)/2;  
		   while( first <= last ){  
		      if ( arr[mid] < key ){  
		        first = mid + 1;     
		      }else if ( arr[mid] == key ){  
		        System.out.println("Element is found at index: " + mid);  
		        break;  
		      }else{  
		         last = mid - 1;  
		      }  
		      mid = (first + last)/2;  
		   }  
		   if ( first > last ){  
		      System.out.println("Element is not found!");  
		   }  
		 }  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,10,15,20,25,30,35,40,45,50};
		int target = 25;
		int last=arr.length-1;  
        binarySearch(arr,0,last,target);  

	}

}
