class A implements Runnable{ // thread actually implements runable so we can create thread this type also
    public void run(){
        for(int i=0;i<50;i++){
            System.out.println("hi");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B implements Runnable{ // thread actually implements runable so we can create thread this type also
    public void run(){
        for(int i=0;i<50;i++){
            System.out.println("hELLO");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class Threads3 {
    public static void main(String[] args) {
        
        Runnable obj1 = new A();
        Runnable obj2 = new B();

        Thread t1 = new Thread(obj1);
        Thread t2= new Thread(obj2);

        t1.start();
        t2.start();
    }
}
