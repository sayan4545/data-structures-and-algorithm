public class Maximum {
    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(findMax(arr));
        
    }
    public static int findMax(int[] arr){
        if(arr.length==0){
            return 0;
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    
}
