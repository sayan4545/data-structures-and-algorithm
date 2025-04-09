public class spiralPrintMatrix {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,4,5},
            {10,11,12,13,14},
            {45,56,67,78,89},
            {100,101,123,190,209}
        };
        spiralPrint(arr);
        
    }
    public static void spiralPrint(int[][] arr){
        int rows = arr.length;
        int cols = arr[0].length;
        int startRow = 0;
        int endRow = rows-1;
        int startCol = 0;
        int endCol = cols-1;
        int count = 0;
        while(count <(rows*cols)){
            // print row 
            for(int i=startCol;i<=endCol&& count<rows*cols;i++){
                System.out.print(arr[startRow][i]+" ");
                count++;
            }
            startRow++;
            // print last col
            for(int i= startRow;i<=endRow && count< rows*cols;i++){
                System.out.print(arr[i][endCol]+" ");
                count++;
            }
            endCol--;
            //print last row 
            for(int i =endCol;i>= startCol && count< rows*cols;i--){
                System.out.print(arr[endRow][i]+" ");
                count++;
            }
            endRow--;
            // print ist col
            for(int i=endRow;i>=startRow && count< rows*cols;i--){
                System.out.print(arr[i][startCol]+" ");
                count++;
            }
            startCol++;
        }
        System.out.println();
    }
    
}
