class A {
    public void calling() throws Exception  //throws send exception to its calling calss
    {
        System.out.println("In A");
        System.out.println("calling B");
        B obj2 = new B();
        obj2.hi();

    }
}

class B{
    public void hi() throws Exception
    {
        System.out.println("In B");
        int j=10/0;
    }
}

public class Throws1 {
    public static void main(String[] args) {
        A obj = new A();

        try{
            obj.calling();
        }
        catch(Exception e1){
            System.out.println("something happen somewhere " + e1);
        }
    }
}   
