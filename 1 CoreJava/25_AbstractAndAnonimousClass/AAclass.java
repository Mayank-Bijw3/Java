abstract class A{

    public abstract void show();
    public abstract void temp();

}

public class AAclass {
    public static void main(String[] args) {
        
        A obj = new A(){
            public void show(){
                System.out.println("In abstract define and anomious class XD");
            }

            public void temp(){
                System.out.println("Temping...");
            }
        };

        obj.show();
        obj.temp();
    }
}
