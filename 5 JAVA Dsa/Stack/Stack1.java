import java.util.Iterator;
import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
         Stack<Integer> st = new Stack<>(); // DEFAULT GIVEN BY JAVA

         st.push(7);
         st.push(8);
         st.push(9);
         st.push(10);
         st.push(1);

         System.out.println(st.get(2));

         System.out.println(st.peek()); // shows top most item or last added item

         st.addLast(8);

         Iterator<Integer> it = st.iterator();
            while (it.hasNext()) {
                System.out.print(it.next() + " ");
            }
    
        System.out.println();

        st.pop();
        st.pop();
        System.out.println(st.peek());

        System.out.println("is stack empty? "+st.isEmpty());
        System.out.println("size of stack " +st.size());
         

    }
}
