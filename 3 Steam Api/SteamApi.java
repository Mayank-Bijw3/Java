import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SteamApi {

    public static void main(String[] args) {
        
        List<Integer> l1 = new ArrayList<>();
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);

        Stream<Integer> s1 = l1.stream(); //all l1 is in s1 now 
        //it is used to retain original value while perform operations on s1

        s1.forEach(n->System.out.println(n));
        s1.forEach(n->System.out.println(n));
        // stream can be used only once so 2nd time it throws an error

        Stream<Integer> s2 = s1.filter(n-> n%2==0); //s2 has only even no. now and it can be use only once 

        int result = s2.reduce(0, (c,e) -> c+e); // it gives a single value

        System.out.println(result);

        //or

        int res2 = l1.stream()
                     .filter(n-> n%2==0)
                     .map(n->n*2)
                     .reduce(0, (c,e)->c+e);
        System.out.println(res2);


        
    }
}