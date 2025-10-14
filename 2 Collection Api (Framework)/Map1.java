import java.util.HashMap;
import java.util.Map;

public class Map1 {  //it does not comes under collection but under its framewok i.e api

    public static void main(String[] args) {
        
        Map<String , Integer> students = new HashMap<String , Integer>();

        students.put("Mayank", 99);
        students.put("pandit", 89);
        students.put("vedant", 90);
        students.put("ayush", 79);

        students.put("pandit", 100); // key is unique alwasy so only value is updated no new entry


        System.out.println(students);

        System.out.println(students.get("Mayank"));

        for(String key : students.keySet()){
            System.out.println(key + " " + students.get(key));
        }
    }    
}
