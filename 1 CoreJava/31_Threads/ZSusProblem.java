class Counting {
    int counter=0;
    public synchronized void increment(){
        counter+=1;
    }  
}


public class ZSusProblem {
    
    public static void main(String[] args) throws InterruptedException {

        Counting c = new Counting();
        
        Runnable obj1 = new Runnable() {
             public void run(){
                for(int i=1;i<=1000;i++){
                     c.increment();
                }
            }
        };
    
            //OR 
        
            //simply lambda
        Runnable obj2 = () ->
            {
                for(int i=1;i<=1000;i++)
                {
                    c.increment();
                }
            };

            Thread t1 = new Thread(obj1);
            Thread t2= new Thread(obj2);

            t1.start();
            t2.start();

            //System.out.println(c.counter);   ans is RANDOM coz main start the thread and proceed to next instruction and which is print and END

            t1.join(); //this tells main to wait till 2 seprate threads joined thee main thread execution
            t2.join();

           // System.out.println(c.counter);
            //still unpredictable but at least we can do this much

            //so finally to make consistent and at a time use variable by 1 thread   ADD SYNCHRONOUS TO THE METHOD
            System.out.println(c.counter);
        }     
    }

        
    

