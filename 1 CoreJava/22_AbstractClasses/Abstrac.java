 // abstract method can only be used in abstract class

abstract class Car{

    //public  void drive();  decleration but shows error
    public abstract void drive();

    public void playMusic(){
        System.out.println("Playing Music");
    }
}

class WagonR extends Car{

    //public void drive1();    the abstract method must be override it is compulsion

    public void drive(){  //actual defining of function
        System.out.println("Driving...");
    }
}

class Abstrac {
   public static void main(String[] args) {

    // Car c1 = new Car();   cant create object of abstract class

    Car obj =  new WagonR();
    obj.drive();
    obj.playMusic();

    
   } 
}

// abstract class can contain both methods abstract and normal
