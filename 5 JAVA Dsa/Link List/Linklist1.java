import java.util.Iterator;
import java.util.LinkedList;

public class Linklist1 {
    public static void main(String[] args) {
        
        LinkedList<Integer> list = new LinkedList<>(); //by def given by java

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.add(3,9);

        list.addFirst(100);

        Iterator<Integer> iterator = list.iterator(); // Obtain the Iterator
        System.out.println("Iterating using Iterator:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
