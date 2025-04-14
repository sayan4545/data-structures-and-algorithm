public class CustomStackImpl{
    private static final int DEFAULT_SIZE = 10;
    private int ptr = -1;
    private int[] data;

    public CustomStackImpl(){
        this(DEFAULT_SIZE);
    }
    public CustomStackImpl(int size){
        this.data = new int[size];
    }

    public boolean push(int element){
        if(isFull()) resize();
        ptr++;
        data[ptr] = element;
        return true;
    }
    public boolean resize(){
        int[] temp = new int[data.length*2];
        for(int i=0;i<data.length;i++){
            temp[i] = data[i];

        }
        data = temp;
        return true;
    }
    public boolean isFull(){
        return ptr == data.length -1;
    }

    public boolean isEmpty(){
        return ptr == -1;
    }
    public int pop() throws Exception {
        if (isEmpty()){
            throw new Exception("Cannot pop from an empty stack");
        }
        return data[ptr--];
    }
    public int peek() throws Exception{
        if (isEmpty()){
            throw new Exception("Cannot peek from an empty stack!");
        }
        return data[ptr];
    }
    @Override
    public String toString() {
        return "CustomStackImpl [toString()=" + super.toString() + "]";
    }
    public void display(){
        for(int i =0;i<=ptr;i++){
            System.out.print(data[i]+" ->S->");
        }
        System.out.println("END");
    }


    public static void main(String[] args) {
        CustomStackImpl cs = new CustomStackImpl(3);
        cs.push(34);
        cs.push(12);
        cs.push(25);
        cs.push(78);
        cs.display();
    }
}