// interface works simpilar to abstract class
// interface are used to generalise things

 interface Computers {

    void code();  // no need for public and abstract keyword just declare
    
}

 class Laptop implements Computers{ //implement == extends

    public void code(){
        System.out.println("Coding on laptop");
    }
 }

 class Desktop implements Computers{ //implement == extends

    public void code(){
        System.out.println("Coding on Desktop");
    }
 }


class Developer{
    public void devApps(Computers comp){ // taken computer type as object
        comp.code(); //calling function
    }
 }
public class Interfaces2 {

    public static void main(String[] args) {
        
        Computers lap = new Laptop();
        Computers desk = new Desktop();

        Developer mayank = new Developer(); 
        mayank.devApps(desk); // based on passed object specific class function called

        mayank.devApps(lap);
    }
    
}