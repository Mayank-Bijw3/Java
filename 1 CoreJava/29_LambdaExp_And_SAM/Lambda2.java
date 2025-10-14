interface A{
    void show( int k);
}

public class Lambda2 {
    public static void main(String args[]){

        A obj = (int k)-> System.out.println("Hello ji " + k);
        obj.show(7);

        //OR

        A obj2 = k -> System.out.println("Hello ji " + k);
        obj2.show(9);

        // baground

        // A obj = new A
        // {
        //     public void show(int k){
        //         System.out.println("hello ji " + k);
        //     }
        // };
    }
}
