public class Finally1 {
    public static void main(String[] args) {
        
        try{
            int j=5/0;
            System.out.println("byeeee");
        }
        catch(Exception e){
            System.out.println("something went wrong");
        }
        finally{ //it gets executed whether exception or not
            System.out.println("with exceptions");
        }



        

        try{
            //nothing just to check
            System.out.println("byeeee2");

        }
        finally{
            System.out.println("without exceptions");
        }
    }
}
