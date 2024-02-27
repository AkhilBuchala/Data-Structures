
public class BinarySearch {

    public int binarySearch(int arr[], int x) {
        int high = arr.length - 1;
        int low =0;
        while(low<=high) {
            int mid = (low + high)/2;

            if(arr[mid]>x) {
                high = mid -1;
            }
            else if(arr[mid]<x) {
                low = mid+1;
            }
            else {
                return mid;
            }

        }
        return -1;
    }

    public static void main(String args[]){
        BinarySearch obj = new BinarySearch();
        int arr[] = {1,2,3,6,8};
        int x = 3;
        int result = obj.binarySearch(arr,x);
        if(result == -1){
            System.out.println(x+"not found in array");
        } else {
            System.out.println(x+"is present at index "+result);
        }

    }
}
