
// make a method final so that no cannot be overide it

class Calc{
    final public void show(){
        System.out.println("in calc show");
    }

    public void add(int a,int b){
        System.out.println(a+b);

    }
}

class AdvCacl extends Calc{
    
}


public class Final3Method {
    public static void main(String[] args) {

    Calc obj = new Calc();
    obj.show();
    obj.add(2,3);
    }
}
