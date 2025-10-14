
// make a class final so that no can extend/inherit it

final class Calc{
    public void show(){
        System.out.println("in calc show");
    }

    public void add(int a,int b){
        System.out.println(a+b);

    }
}

// class AdvCacl extends Calc{
    //Error
// }

public class Final2Class {
    public static void main(String[] args) {

    Calc obj = new Calc();
    obj.show();
    obj.add(2,3);
}
}
