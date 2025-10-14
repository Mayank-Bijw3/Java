class A{
    public void show1(){
        System.out.println("In A Show");
    }
}

class B extends A{
    public void show2(){  // no overriding
        System.out.println("In B Show");
    }
}

class UpCasting {

    public static void main(String[] args) {
        
    A obj = (A) new B();  // upcasting
  //A obj = new B()          this also works as same
    obj.show1();
    obj.show2();   // error we cant call show 2 thats why downcasting

    B obj1 = (B) obj;  // Downcasting
    obj1.show2();
}
}
