public class setHash {
    public static void main(String[] args) {
        java.util.HashSet<Integer> set = new java.util.HashSet<>();

        set.add(5);
        set.add(10);
        set.add(15);
        set.add(20);
        set.add(25);

        System.out.println(set.contains(10)); //true
        System.out.println(set.contains(50)); //false

        set.remove(15);
        System.out.println(set);

        for(int val : set){
            System.out.println(val);
        }
    }
    
}
