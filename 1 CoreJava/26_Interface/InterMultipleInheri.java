interface Living{
    void movement();
}

interface Human{
    void grow();
}

interface HomoSepiens{
    void monkey();
}

interface Sepiens extends HomoSepiens{ // inheritance works in interfaces too

}

class Male implements Living,Human,HomoSepiens{

    public void movement() {
        System.out.println("Moving...");
    }
    
    public void grow() {
        System.out.println("Growing...");
    }
    
    public void monkey() {
        System.out.println("Moking...");
    }

    
}

public class InterMultipleInheri {
    public static void main(String[] args) {
        
        // only locha is we have to create respected object for each
        // to call their specific method

        Living obj1 = new Male();
        obj1.movement();
    //   obj1.monkey();   error

        Human obj2 = new Male();
        obj2.grow();
        //other methods error so this is one problem
    }
}
