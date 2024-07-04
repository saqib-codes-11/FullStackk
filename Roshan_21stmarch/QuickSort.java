public class QuickSort {
    public static void main(String args[]){
        int arr[]={34,89,3,78,90};
        int low=0;
        int high= arr.length-1;
        quicksort(arr,low,high);
        System.out.println("Array after quick sort");
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static int  partion(int arr[],int low,int high) {
        int pivot = arr[high];
        int i = low-1;
        for(int j = low; j <high-1 ; j++)
        {
            if (arr[j] < pivot)
            {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }
    static void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    static void quicksort(int arr[],int low ,int high){
        if(low<high) {
            int pivot = partion(arr, low, high);
            quicksort(arr, low, pivot - 1);
            quicksort(arr, pivot + 1, high);
        }

    }
}
