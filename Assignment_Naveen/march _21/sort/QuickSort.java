package assign;
import java.util.Arrays;
public class QuickSort {

	public static void main(String args[]) {
      
        int arr[] = {7,14,10,60,82,45,32,72,93,22,0}; 
        int n = arr.length; 
        
        System.out.println("Original Array: " + Arrays.toString(arr));
     
        quick_sort(arr, 0, n-1); 
        
        System.out.println("Sorted Array: " + Arrays.toString(arr)); 
    } 
	
	static void quick_sort(int arr[], int low, int high) { 
        if (low < high) { 
            
            int pi = partition(arr, low, high); 
   
            quick_sort(arr, low, pi-1); 
            quick_sort(arr, pi+1, high); 
        } 
    } 
	
	static int partition(int arr[], int low, int high) { 
        int pi = arr[high];  
        int i = (low-1);  
        for (int j=low; j<high; j++) { 
            if (arr[j] <= pi) { 
                i++; 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
   
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
   
        return i+1; 
    } 
}
