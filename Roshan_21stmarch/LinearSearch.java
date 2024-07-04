
public class LinearSearch {
    public static void main(String args[]){
        int arr[]={2,3,4,5,6,7,8,9};
        int search =9; int res=0;
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == search) {
                res=index;
            }
        }
        System.out.println(res);
    }
}
