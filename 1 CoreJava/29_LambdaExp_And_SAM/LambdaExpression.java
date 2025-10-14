@FunctionalInterface
interface A{ 
    void show();
}



public class LambdaExpression {
    public static void main(String[] args) {

       A obj = () ->    // this -> is lambda expression
                        // which almost replace the anomonymous class
        {
                System.out.println("In shows");
        };
        
        // OR simply

        A obj2 = () -> System.out.println("WALLAH");
        
        obj.show();
        obj2.show();

    }
}

