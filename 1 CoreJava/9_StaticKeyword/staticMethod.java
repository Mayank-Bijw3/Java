class Mobile{
    int price;
    String Name;
    static String os;

    public Mobile(int a, String b){//consturctor
        price = a;
        Name = b;
    }


    public static void print(String temp){

        os=temp;   // only static variable is used within static method
        System.out.println("In static method");
    }
}


public class staticMethod {
    public static void main(String[] args) {
        
        Mobile.print("ios");

        Mobile m1 = new Mobile(7000,"Oppo");
    }
}
