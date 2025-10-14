import java.util.HashSet;
import java.util.Set;

public class Set1 {
    public static void main(String[] args) {
        

        Set<Integer> s1 = new HashSet<Integer>(); 

        s1.add(51);
        s1.add(42);
        s1.add(36);
        s1.add(29);
        s1.add(51);

        System.out.println(s1);

        for(int n : s1)
            System.out.println(n); // see 5 is only once and no indexing
    }
}
 