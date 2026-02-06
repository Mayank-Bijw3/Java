package Map;
import java.util.HashMap;

public class mapHash {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();


        map.put("India", 120);
        map.put("Us", 30);
        map.put("China", 100);
        map.put("Nepal", 10);  

        System.out.println(map.get("Us"));
        System.out.println(map.containsKey("India"));
        System.out.println(map.remove("China"));
        System.out.println(map);
    }
    
}
