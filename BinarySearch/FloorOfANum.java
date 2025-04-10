package BinarySearch;

public class FloorOfANum {
    public static void main(String[] args) {
        
        int[] nums = {7,8,9,12,16,19,21};
        System.out.println(findFloor(nums,12 ));
    }
    
    public static int findFloor(int[] nums, int k){
        int low = 0;
        int high = nums.length-1;
        int ans = 0;
        while(low<=high){
            int mid = low + (high -low)/2;
            if(nums[mid]== k){
                ans = mid;
                return ans;
            }
            else if (nums[mid]> k) {
                high = mid-1;
            }
            else{
                ans = mid;
                low = mid +1;

            }
        }
        return ans;
    }
    
}
