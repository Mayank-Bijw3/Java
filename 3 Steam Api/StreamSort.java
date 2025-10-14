import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamSort {
    public static void main(String[] args) {
        
        List<Integer> li = new ArrayList<>();

        li.add(7);
        li.add(3);
        li.add(2);
        li.add(5);
        li.add(1);
        System.out.println(li);

        Stream<Integer> sorting = li.stream()
                                    .filter(n -> n%2==0)
                                    .sorted();

        sorting.forEach(n -> System.out.println(n));


        

    }
}
