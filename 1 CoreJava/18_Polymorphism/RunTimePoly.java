// run time poly by using dynamic method dispatch

class Computer{
    public void show(){
        System.out.println("In A Show");
    }
}
class Laptop extends Computer{
    public void show(){
        System.out.println("In B Show");
    }
}
class MiniPc extends Computer{
    public void show(){
        System.out.println("In C Show");
    }
}
class Mobile{
    public void show(){
        System.out.println("In M Show");
    }
}

public class RunTimePoly {
    public static void main(String[] args) {

        Computer temp = new Laptop(); //refrence of super class and object of cur rent class
        temp.show();

        Computer obj = new Computer(); // obj1 refers to class comp
        obj. show();

        obj = new Laptop();  // obj1 refers to class laptop
        obj.show();

        obj = new MiniPc();
        obj.show();

        obj = new Mobile(); // not extending (inheriting parent class)
        obj.show();
    }
}



//this is known as Dynamic Method Dispatch
//works only with inheritance 
//it is a type of runtime polymorphism