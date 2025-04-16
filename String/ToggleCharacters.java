
import java.util.Arrays;

public class ToggleCharacters {
    public static void main(String[] args){
        char[] arr = {'a','B','c'};
        for(int i =0; i < arr.length;i++){
            if(arr[i]>96){
                arr[i] = (char) (arr[i]-32); 
            }
            else{
                arr[i] = (char) (arr[i] + 32);
            }
        }
        System.out.println(Arrays.toString(arr));


    }
    
}
