package Java8Features.LambdaExpression;

public class basics {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Task1());
        t1.start();

        Thread t2 = new Thread(()->{
            System.out.println("task2");
        });
        t2.start();
        
    }
    
    
}
class Task1 implements Runnable {
    @Override
    public void run(){
        System.out.println("task1");
    }
}
