

public class Except1 {
    public static void main(String[] args) {
        
        int i =0; // simple statement no harm 

        //int j = 9/i;  // it is a critial statement and j depends in i if i==0 then uk
        
        int j = 0;

        //telling java hey just try this if it works good else SKIP it and continue
        try {
        
            j=9/i;
        } // if error it throws as an Object
        catch(Exception e){
        
            System.out.println("Something went wrong & " + e);
            // even if something went wrong remaining code will executes
        } 

        System.out.println("hello");
        
    }
}
