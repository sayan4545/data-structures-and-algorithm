package Java8Features.LambdaExpression;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class IntermediateOperations {
    public static void main(String[] args) {
        // intermediate operations transforms obne steream to a different streamn
        // Intermediate operations dont execute untill a terminal operation is 
        // invoked.
        List<String> names = Arrays.asList("Akshay","madhuri","Salman");
        System.out.println("Printiong the original list : " + names);
        List<String> namesFiltered = names.stream().filter(x -> x.length()>6).collect(Collectors.toList());
        System.out.println("Printing the filterred list: " + namesFiltered);

        List<Integer> listNum = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Boolean> mappedListNum = listNum.stream().map(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println("Mapped list with boolean values: " + mappedListNum);

        List<String> listOfnames = Arrays.asList("bob","sayan","chandrika");
        List<String> mappedNames = listOfnames.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
        System.out.println(mappedNames);
        System.out.println(listOfnames);
        
    }
    
}
