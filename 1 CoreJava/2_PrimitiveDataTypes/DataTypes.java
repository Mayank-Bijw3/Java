public class DataTypes {
    public static void main(String a[]){
        int i = 4;
        System.out.println("int "+i+" bytes");

        long l = 8;
        System.out.println("long "+l+" bytes");

        short s = 2;
        System.out.println("short "+s+" bytes");

        byte b = 1;
        System.out.println("byte "+b+" bytes");

        float f = 4.0f;
        System.out.println("float "+f+" bytes");

        //by def java support double not float
        double d = 8.0;
        System.out.println("double "+d+" bytes");

        //follows UNICODE not ASCII
        char ch = 'b';
        System.out.println("char "+(ch-'a'+1)+" bytes");

        //dont work with 0 and 1 only true and false
        boolean bool = true;
        System.out.println("boolean "+bool+" bytes");




    }
}
