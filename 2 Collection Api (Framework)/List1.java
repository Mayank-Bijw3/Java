import java.util.*;

// List supports duplicate values
public class List1 {
    public static void main(String[] args) {
        
        List<Integer> l1 = new ArrayList<Integer>();

        l1.add(5);
        l1.add(4);
        l1.add(3);
        l1.add(2);

        // now list support indexing 

        System.out.println(l1.get(2));

        for(Object n : l1){
            int nums = (Integer)n;  // to perform operation convertiong obj to int type

            System.out.println(nums*2);
        }

        //or

        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }

        //or

        l1.forEach(i->System.out.println(i)); //inbuilt loop
        
    }
}
