class car {

    int price;
    String name ="";
    static String Company="";

    public car(){
        price=1700;
        name = "i10";
        Company = "zzzzzz";
        System.out.println("Inside constructor");
    }

    static{  // static bloack called only once irrespective how many objectis i create
                // and basicaly it is used to initiate static variables bs
        Company = "Hundai";
        System.out.println("Inside Static block");

    }
    
    public void show(){
        System.out.println(Company + " " + name + " " + price);
    }
}

public class Staticpart2 {
    public static void main(String[] args) {
        
        car c1 = new car();
        car c2 = new car();

        System.out.println();
        System.out.println("Now show method");
        System.out.println();

        c1.show();
        c2.show();

    }
}
