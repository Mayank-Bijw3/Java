public class Throw3 {
    
    public static void main(String[] args) {
 
        int i=10;
        int j=0;

        try {
            j=5/i;

            if(j==0)    //here j=5/10 i.e 0
                throw new ArithmeticException("pLEASE DONT DIV BY 0");
            //this object throws itself as an error so that 
            //by default each time the catch block act on it
            
        } 
        catch (ArithmeticException e) {
            j=5/1;
            System.out.println("Thats the default value:" + e);
        }
        catch(Exception e3){
            System.out.println("Unknown exception type which idk");
        }
        System.out.println(j);
    }
}
