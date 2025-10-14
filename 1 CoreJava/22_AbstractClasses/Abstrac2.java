abstract class Car{

    public abstract void drive();
    public abstract void fly(); // another abstract method

    public void playMusic(){
        System.out.println("Playing Music");
    }
}

abstract class WagonR extends Car{

    // due to some reasons fly() method cant be implemented in here sooo
    // this class also becomes abstract or it shows error

    public void drive(){  
        System.out.println("Driving...");
    }
}

class UpdatedWagonR extends WagonR{
    //now this class can fullfill fly method

    public void fly(){
        System.out.println("Flying...");
    }

}


class Abstrac2 {
   public static void main(String[] args) {

   // Car obj =  new WagonR();  we cant create object of wagonr soo
   Car obj = new UpdatedWagonR();
    obj.drive();
    obj.playMusic();
    obj.fly();

    
   } 
}

// abstract class can contain both methods abstract and normal
