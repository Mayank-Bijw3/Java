import java.util.ArrayList;
import java.util.Collection;

public class Colection {
    public static void main(String[] args) {
        
        Collection<Integer> nums = new ArrayList<Integer>();

        nums.add(5);  // these are not numbers these are object types
        nums.add(1);
        nums.add(2);
        nums.add(7);

        System.out.println(nums); // it prints all and it dont have index so for each loop

        for(Object n:nums)
            System.out.println(n);
    }
}
