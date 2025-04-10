package BinarySearch;

public class PlainBs {
    public static void main(String[] args) {
        int[] arr = {4,6,8,9,12,14,16};
        System.out.println(search(arr, 9));       
    }
    public static int search(int[] arr, int k){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]==k) return mid;
            else if (arr[mid]>k){
                high = mid-1;
            }
            else {
                low = mid +1;

            }
        }
        return -1;
    }

    
}
