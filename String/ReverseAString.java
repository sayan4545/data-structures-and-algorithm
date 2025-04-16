public class ReverseAString {
    public static void main(String[] args) {

        String str = "Sayan";
        System.out.println(reverse(str));
        
    }
    public static String reverse(String str){
        char[] arr = new char[str.length()];
        for(int i=0;i<str.length();i++){
            arr[i] = str.charAt(i);
        }
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = (char)temp;
            start ++;
            end--;
        }
        return new String(arr);
    }
    
}
