class A extends Thread  
{
    public void run(){ 
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
public class Threads2 {
    public static void main(String[] args) {
        
        A obj1 = new A();
        B obj2 = new B();

        obj2.setPriority(Thread.MAX_PRIORITY);

        obj1.start();  
        obj2.start();

    }
}

