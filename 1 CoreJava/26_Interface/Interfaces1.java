interface A{ // cannot instinciate i.e create object of interace same as abstract class
    void method1();
    void method2();

    int age = 22;  // by def static and final
}

class B implements A{
    public void method1(){
        System.out.println("Hi");
    }

    public void method2(){
        System.out.println("Hello");
    }
}
public class Interfaces1 {
    public static void main(String[] args) {
        
       // A obj =  new A(); //error

       A obj = new B();
       obj.method1();
       obj.method2();

       System.out.println(A.age);
    }
}
