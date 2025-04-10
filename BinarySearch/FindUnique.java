public class FindUnique{
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,6,6,4,4,3,3,9,10,10};
        System.out.println(findUnique(arr));
        System.out.println(findUnioque2(arr));
    }
    public static int findUnique(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
    
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if ((mid == 0 || arr[mid] != arr[mid - 1]) && (mid == arr.length - 1 || arr[mid] != arr[mid + 1])) {
                return mid; 
            }
            if (mid < arr.length - 1 && arr[mid] == arr[mid + 1]) {
                if (mid % 2 == 0) {
                    low = mid + 2;
                } else {
                    high = mid - 1;
                }
            }
            else if (mid > 0 && arr[mid] == arr[mid - 1]) {
                if ((mid - 1) % 2 == 0) {
                    low = mid + 1;
                } else {
                    high = mid - 2;
                }
            }
        }
        return -1;
    }
    public static int findUnioque2(int[] arr){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(arr[low]!=arr[low+1]){
                return low;
            }
            if(arr[arr.length-1] != arr[arr.length-2]){
                return high;
            }
            if (arr[mid]!= arr[mid-1] && arr[mid]!=arr[mid+1]){
                return mid;
            }
            else if (arr[mid]==arr[mid-1]){
                mid --;
                
            }
            else if(mid%2==0){
                low = mid +2;

            }else{
                high = mid -1;
            }
        }
        return -1;

    }
}