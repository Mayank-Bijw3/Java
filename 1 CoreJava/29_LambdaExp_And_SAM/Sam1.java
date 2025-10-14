
@FunctionalInterface
interface A{  // functional or sam interface has only 1 metahod
    void show();
}

// class B implements A{
//     public void show(){
//         System.out.println("In B show");
//     }
// }

public class Sam1 {
    public static void main(String[] args) {
       // A obj = new B()   //or

       A obj = new A()
        {
            public void show(){
                System.out.println("In shows");
            }
        };
        obj.show();

    }
}
