interface A{
    int add( int a, int b,int c);
}

public class Lambda3 {
    public static void main(String args[]){

        A obj = ( a,  b,  c) -> a+b+c;
           
        obj.add(7,3,1);


        // baground

        // A obj = new A
        // {
        //     public void show(int k){
        //         System.out.println("hello ji " + k);
        //     }
        // };
    }
}
