class A{
    public A(){
        System.out.println("in A default");
    }
    public A(int temp){
        System.out.println("in A parameterized");
    }
}

class B extends A {
    public B (){
        super();    // super calls the def constructor of parent class
        System.out.println("in B default");

    }
    public B(int temp){
        this();  //calls the def constructor of same class
        System.out.println("in B parameterized");
    }
}

public class thisfunction {
    public static void main(String[] args) {
        
        B obj1 = new B(7);
    }
}
