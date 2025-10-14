class AA{
    public void show(){
        System.out.println("In class A show");
    }

    public void config(){
        System.out.println("In class A Config");
    }
}
class BB extends AA{
    public void show(){
        System.out.println("In class B show");

    }
}

public class MethodOverRide {
    public static void main(String[] args) {
        
        BB obj1 = new BB();
        obj1.show();


    
    }
}
