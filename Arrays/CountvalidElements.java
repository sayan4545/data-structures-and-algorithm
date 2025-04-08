
import java.util.Arrays;
import java.util.Scanner;

public class CountvalidElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        //Taking input
        for (int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        int validCount = validElements(arr);
        System.out.println("The valid number of elements are : "+ validCount);
        
        
    }
    public static int validElements(int[] arr){
        int max = findMax(arr);
        int validCount = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=max){
                validCount++;
            }
        }
        return validCount;

    }
    public static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    
}
