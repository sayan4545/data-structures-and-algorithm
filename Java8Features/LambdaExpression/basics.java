package Java8Features.LambdaExpression;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;
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
        // Function
        Function<Integer,Integer> doubleiIt = x -> x*2; 
        Integer result = doubleiIt.apply(10);
        System.out.println(result + " //  //  // Function impl");
        Function<Integer,Integer> tripleIt = x -> 3*x;
        System.out.println(tripleIt.andThen(doubleiIt).apply(3)); // 18
        Function<Integer,Integer> fun = Function.identity();
        int res = fun.apply(5);
        System.out.println(res + " o/p of res");
        // Consumer
        Consumer<Integer> print = (x)-> System.out.println(x);
        print.accept(89);
        List<Integer> list = Arrays.asList(1,2,3);
        Consumer<List<Integer>> conumeList = x ->{
            for (int i : x) {
                System.out.print(i + " ");
            }
        };
        conumeList.accept(list);
        // supplier
        Supplier<String> givehelloWorld = () -> "hello World";
        String str = givehelloWorld.get();
        System.out.println(str);

        Predicate<Integer> predicate2 = x -> x%2==0;
        Consumer<Integer> consumer = x -> System.out.println(x);
        Supplier<Integer> supplier = () -> 10;
        Function<Integer,Integer> function = x -> x*x;

        if(predicate2.test(supplier.get())){
            consumer.accept(function.apply(supplier.get()));
        }
        BiPredicate<Integer,Integer> isSumEven = (x,y) -> (x+y) %2 == 0;
        System.out.println(isSumEven.test(8,8));

        BiPredicate<Integer,Integer> isSumOdd = (x,y) -> (x-y) %2 != 0;
        System.out.println(isSumOdd.test(7, 1)); // should give false
        UnaryOperator<Integer> lengthOfString = x -> x*2;
        System.out.println(lengthOfString.apply(6));//12

        BinaryOperator<Integer> binary = (x, y) -> (x + y);
        System.out.println(binary.apply(6, 9));//15

        // Method reference

        List<String> l1 = Arrays.asList("Ram", "Shyam", "Ghanasyam");
        l1.forEach(x -> System.out.println(x));
        l1.forEach(System.out:: println);

        List<String> names = Arrays.asList("A","B","C");
        List<Mobile> mobilePhones = names.stream().map(Mobile :: new).collect(Collectors.toList());
        System.out.println(mobilePhones);
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        List<Integer> streamedEvenNos = numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(streamedEvenNos);   
        //creating streams 
        String[] array = {"a","b","c","d","e"};
        Stream<String> stream1 = Arrays.stream(array);
        System.out.println(stream1.toList());
        System.out.println(Arrays.toString(array));                    
        
    }    
}
class Mobile{
    String name;

    public Mobile(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Mobile{");
        sb.append("name=").append(name);
        sb.append('}');
        return sb.toString();
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
