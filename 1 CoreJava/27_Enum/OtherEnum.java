
enum Laptops{
    Hp(60000),Dell(55000),Mackbook(100000),Asus(70000);

    private int price;

    private Laptops(int price) { //constructor for laptops 
        System.out.println("In constructor "+this.name());
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}


public class OtherEnum {
    public static void main(String[] args) {
        
        Laptops lap = Laptops.Hp;
        Laptops lap1 = Laptops.Asus;

        System.out.println(lap + " " + lap.getPrice());
        System.out.println(lap1 + " " + lap1.getPrice());


        lap.setPrice(61000);
        System.out.println("new Price of "+ lap +" is "+ lap.getPrice());
    }
}