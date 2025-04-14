package Java8Features.LambdaExpression;

import java.util.Scanner;
import java.util.function.Predicate;

public class basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Thread t1 = new Thread(new Task1());
        t1.start();

        Thread t2 = new Thread(()->{
            System.out.println("task2");
        });
        t2.start();
        MathOps add = (a, b) -> {
            return a + b;
        };
        System.out.println(add.operate(10, 123));
        MathOps sub = (a,b)-> a-b;
        System.out.println(sub.operate(8, 9));
        // Predicate 
        Predicate<Integer> predicate = x -> x % 2 == 0;
        System.out.println(predicate.test(8));// should return true
        Predicate<String> isStartsWithA = x -> x.charAt(0) == 'A';
        System.out.println(isStartsWithA.test("Anuska"));// Should return true;

        System.out.print("Enter a character to compare: ");
        char inputChar = sc.next().charAt(0);
        Predicate<String> isStartsWithDynamically = x -> x.charAt(0) == inputChar;
        System.out.println(isStartsWithDynamically.test("Chandrika Dey")); 
        // search ls = (int[] array,int target) -> {
        //     for (int i = 0; i < array.length; i++) {
        //         if (array[i] == target) {
        //             return true;
        //         }
        //     }
        //     return false;
        // };
        Predicate<String> isEndingWith = x -> x.toLowerCase().startsWith("y");
        Predicate<String> combinedAnd = isStartsWithA.and(isEndingWith);
        combinedAnd.test("Chandrika Dey");
        //int[] numbers = {1, 2, 3, 4, 5};
        //System.out.println( ls.search(numbers,sc.nextInt()));
    }    
}
class Task1 implements Runnable {
    @Override
    public void run(){
        System.out.println("task1");
    }
}
@FunctionalInterface
interface MathOps{
    int operate(int a, int b);
}
@FunctionalInterface
interface search{
    boolean search(int[] array, int k);
}
