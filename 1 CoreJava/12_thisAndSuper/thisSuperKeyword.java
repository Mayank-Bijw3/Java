class Humans{ //extends Object by def its not there

    // default constructor of Humans
    public Humans() 
    {
        //super(); by default it is here
        // it by def calls default consturctor of parent class
        System.out.println("in Humans");
    }

    //parameterized constructor of humans
    public Humans(int temp){
        //super(); by default it is here
        // it by def calls default consturctor of parent class
        System.out.println("in Humans in parameterized");
    }
}
class Female extends Humans
{
    //default constructor of female class
    public Female(){
        //super(); by default it is here
        // it by def calls default consturctor of parent class
        System.out.println("in female");
    }

    //parameterized constructor of female class
    public Female(int age){
        //super(); by default it is here
        // it by def calls default consturctor of parent class
        super(age);
        System.out.println("in female parameterized constructor");
    }

    
}
public class thisSuperKeyword {
    public static void main(String[] args) {
        
        // Humans h1 = new Humans();
        Female f1 = new Female();
        
        System.out.println("");

        Female f2 = new Female(16);
    }
}
