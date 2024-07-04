

public class BinarySearch {
    public static void main(String[] args){
        int[] arr ={2,3,4,5,6,7,8,9};
        int element =9; int res; int low=arr[0]; int high=arr[arr.length-1];
        res=binarySearch(arr,element,low,high);
        System.out.println(res);
    }
    static int binarySearch(int[] arr, int element, int low, int high) {

        if (high >= low) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == element){
                return mid;
            }
            if (arr[mid] > element){
                return binarySearch(arr, element, low, mid - 1);
            }
            return binarySearch(arr, element, mid + 1, high);
        }

        return -1;
    }
}
