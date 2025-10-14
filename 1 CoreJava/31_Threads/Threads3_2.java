public class Threads3_2 {
    public static void main(String[] args) {
        
        Runnable obj1 = new Runnable() {
             public void run(){
                for(int i=0;i<5;i++){
                     System.out.println("hi");
                        try {Thread.sleep(10);} catch (InterruptedException e) {e.printStackTrace();}
                }
            }
        };
    
            //OR 
        
            //simply lambda
        Runnable obj2 = () ->
            {
                for(int i=0;i<5;i++)
                {
                    System.out.println("hEllo");
                    try {Thread.sleep(10);} catch (InterruptedException e) {e.printStackTrace();}
                }
            };

            Thread t1 = new Thread(obj1);
            Thread t2= new Thread(obj2);

            t1.start();
            t2.start();
        }     
    }

        
    

