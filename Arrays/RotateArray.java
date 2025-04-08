import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int [] arr = {1,2,5,6,12,-2,9};
        int k = 3;

        reverseWithinLimits(arr, 0, arr.length-1);
        reverseWithinLimits(arr,0, k-1);
        reverseWithinLimits(arr, k, arr.length-1);

        System.out.println(Arrays.toString(arr));

    }

    public static void reverseWithinLimits(int[] arr, int startIndex, int endIndex){
        while(startIndex<endIndex){
            int temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
    }

}