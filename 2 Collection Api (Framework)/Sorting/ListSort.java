import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListSort {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        List<Integer> li = new ArrayList<>();

        System.out.println("Enter elements");

        for(int i=0;i<5;i++)
            li.add(sc.nextInt());

        System.out.println(li);

        Collections.sort(li);//

        System.out.println(li);

    }
}
