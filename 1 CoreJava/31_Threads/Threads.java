class A extends Thread  // this extend thread class makes any object class threads ez
{
    public void run(){ // remember start method always calls run method
        for(int i=0;i<50;i++)
            System.out.println("H1");
    }
}

class B extends Thread
{
    public void run(){ 
        for(int i=0;i<50;i++)
            System.out.println("Hell0");
    }
}
public class Threads {
    public static void main(String[] args) {
        
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();  // start method to call run
        obj2.start();

    }
}
