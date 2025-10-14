class A{
    
    int age;

    public void show(){
        System.out.println("In show");
    }   

    class B{
        public void config(){
            System.out.println("In config");
        }
    }
}
public class ClassWithinAClass {

    public static void main(String[] args) {
        
        A obj = new A();
        obj.show();

        A.B obj1; 
        obj1 = obj.new B();  // required object of A to create B's Object
        obj1.config();       // coz config is not a static method

        // OR

        A.B obj2 = obj.new B();
        obj2.config();
    }
    
}
