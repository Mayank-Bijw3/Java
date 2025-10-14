class mobiles {
    
    static String name;    // static variable is a common variabe for all objets having same value as well

    String Brand;
    int price;


    public void show(){
        System.out.println(Brand + " " + price + " " + name);
    }
}

public class keyWordStatic {
    
    public static void main(String[] args) {
    
        mobiles obj = new mobiles();

        obj.Brand = "Oppo";
        obj.price = 17000;
        obj.name = "A15s";

        mobiles obj1 = new mobiles();

        obj1.Brand = "Iqoo";
        obj1.price = 20000;
        obj1.name = "Z3";

        mobiles obj3 = new mobiles();
        //obj3.name = "Samsung";
        //or
        mobiles.name = "Z3s";

        obj.show();
        obj1.show();
    }

}
