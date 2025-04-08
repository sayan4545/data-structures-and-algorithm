public class Print2dMatrixRowWise {
    public static void main(String[] args) {
        int[][] nums = {
            {1,2,3},
            {4,5,6,9,10,11,12},
            {8,9,10}
        };
        printMtrix(nums);
        
    }

    public static void printMtrix(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
