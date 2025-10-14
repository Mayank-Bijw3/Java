class MayankException extends Exception{
    //custom exception

    public MayankException(String str){
        //constructor
        super(str);
    }
}

public class Throw4 {
    public static void main(String[] args) {
        
        try{

            throw new MayankException("my custom exception");
        }
        catch(MayankException e){
            System.out.println(e);
        }
        catch(Exception e1){
            System.out.println(e1);
        }
    }
}
