import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Students{
    int age;
    String name;
    public Students(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Students [age=" + age + ", name=" + name + "]";
    }
    
}

public class ListSort2 {
    public static void main(String[] args) {

        Comparator<Students> com = new Comparator<Students>() {  //it is used for comparison
            
            public int compare(Students i , Students j){
                if(i.age > j.age)
                    return 1; //i.e swap
                else
                    return -1; // i.e no swap
            }   
        };
        
        List<Students> li = new ArrayList<>();
        
        li.add(new Students(22, "Mayank"));
        li.add(new Students(21, "Gaurav"));
        li.add(new Students(27, "Pranav"));
        li.add(new Students(18, "Arjun"));
        
        for(Students std :li){
            System.out.println(std);
        }
        System.out.println();

        Collections.sort(li,com);


        for(Students std :li){
            System.out.println(std);
        }
        
    }
}