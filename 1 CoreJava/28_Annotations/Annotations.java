class A{

    public void showing(){
        System.out.println("in A show");
    }
}

class B extends A {

    @Override //it is a annotation here we are telling complier that 
              // i am overriding next function if something goes wrong
              // it will tell me like this
    public void showig()  //see error since name are not same
    {
        System.out.println("In B show");
    }

    
} 

public class Annotations {
    public static void main(String[] args) {
        
        B obj = new B();

        obj.showing();

    }
}
