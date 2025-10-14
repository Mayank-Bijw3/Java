// autoboxing is a way to convert premitive data type to object type

public class AutoBoxing {

    public static void main(String[] args) {
        
        int num = 7 ;    //primitive datatype

        //simple boxing i.e wrapping int to objet
        Integer num1 = new Integer(num); 
        // autoboxing
        Integer num2 = 8;  

        System.out.println(num + " " + num1 + " " + num2);

        //simply unboxing 
        int num3 = num2.intValue(); //object to int (premitive)
        //autoboxing
        int num4 = num1;
        
        System.out.println(num3);
    }
}